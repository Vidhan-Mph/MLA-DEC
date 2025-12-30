package com.mphasis;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Exp1 {

	public static void main(String[] args) throws Exception{
		String url = "jdbc:mysql://localhost:3306/practice";
		
		String username ="root";
		String password ="root@39";
		
//		String sql = "Insert into book values(1, 'Got', '250')";
		
		//1. Load the driver class
		Class.forName("com.mysql.jdbc.Driver");
		
		//2. establish or connection object
		Connection conn = DriverManager.getConnection(url,username,password);
		
		//3.Create statement object
		Statement stmt = conn.createStatement();

		//4.execute query
//		stmt.execute("Create table book(b_id int, b_name varchar(50),b_price int)");
		stmt.addBatch("Insert into book values(2,'Spring',300)");
		stmt.addBatch("Insert into book values(3,'Angular',600)");
		stmt.addBatch("update book set b_name='React' where b_id=3");
		stmt.addBatch("delete from book where b_id =2");
//		stmt.execute(sql);
		stmt.executeBatch();
		
		String sql ="SELECT * FROM BOOK";
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			System.out.println("ID: "+rs.getInt(1)+ "Name: "+rs.getString(2)+"Price: "+rs.getInt(3));
		}
		
		//5.Close connection
		conn.close();
		
		System.out.println("Done.");
	}

}
