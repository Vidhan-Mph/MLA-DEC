package com.mphasis;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class StoredProcedureEx {

	public static void main(String[] args) throws Exception {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/practice";
		
		String username ="root";
		String password ="root@39";
		
		Class.forName(driver);
		
		Connection conn = DriverManager.getConnection(url,username,password);
		
		CallableStatement cst= conn.prepareCall("{call readData}");
		ResultSet rs = cst.executeQuery();
		while(rs.next()) {
			System.out.println("ID: "+rs.getInt(1)+ "Name: "+rs.getString(2)+"PRICE: "+rs.getInt(3));
		}
		
		System.out.println("Done.");
	}

}
