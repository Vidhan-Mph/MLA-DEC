package com.mphasis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Exp2 {

	public static void main(String[] args) throws Exception{
		String url = "jdbc:mysql://localhost:3306/practice";
		
		String username ="root";
		String password ="root@39";
		
//		String sql="CREATE TABLE EMPLOYEES(E_ID INT, E_NAME VARCHAR(50),SALARY INT, LOCATION VARCHAR(50),DESIGNATION VARCHAR(50))";
		
		//1. Load the driver class
		Class.forName("com.mysql.jdbc.Driver");
		
		//2. establish or connection object
		Connection conn = DriverManager.getConnection(url,username,password);
		
		//3.Create statement object
		Statement stmt = conn.createStatement();
		
//		stmt.addBatch("Insert into EMPLOYEES values(1,'JAY',50000, 'MUMBAI', 'ASE')");
//		stmt.addBatch("Insert into EMPLOYEES values(2,'VIDHAN',40000, 'PUNE', 'MANAGER')");
//		stmt.addBatch("Insert into EMPLOYEES values(3,'ISHITA',30000, 'BANGALORE', 'HR')");
		
		String sql ="SELECT * FROM EMPLOYEES";
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			System.out.println("ID: "+rs.getInt(1)+ "Name: "+rs.getString(2)+"SALARY: "+rs.getInt(3)+"LOCATION: "+rs.getString(4)+"DESIGNATION: "+rs.getString(5));
		}
		
		stmt.addBatch("UPDATE EMPLOYEES SET LOCATION='BANGALORE' WHERE E_ID=2");
		stmt.addBatch("DELETE FROM EMPLOYEES WHERE E_ID=3");
		stmt.executeBatch();
//		stmt.execute(sql);
		System.out.println("Done.");
		
		conn.close();

	}

}
