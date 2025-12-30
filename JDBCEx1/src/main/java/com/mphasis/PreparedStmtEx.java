package com.mphasis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class PreparedStmtEx {

	public static void main(String[] args) throws Exception{
		String url = "jdbc:mysql://localhost:3306/practice";
		
		String username ="root";
		String password ="root@39";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection(url,username,password);
		
		String sql = "INSERT INTO BOOK VALUES(?,?,?)";
		String sql2 = "UPDATE BOOK SET B_NAME=? WHERE B_ID =?";
		String sql3 = "SELECT * FROM BOOK ORDER BY B_NAME ASC";
		
		PreparedStatement pstmt1 = conn.prepareStatement(sql);
		pstmt1.setInt(1, 4);
		pstmt1.setString(2, "Python");
		pstmt1.setInt(3,100);
		PreparedStatement pstmt2 = conn.prepareStatement(sql2);
		
		pstmt2.setString(1, "PHP");
		pstmt2.setInt(2, 4);
		PreparedStatement pstmt3 = conn.prepareStatement(sql3);
		
		pstmt1.addBatch();
		pstmt2.addBatch();
		
		pstmt1.executeBatch();
		
		ResultSet rs = pstmt3.executeQuery();
		while(rs.next()) {
			System.out.println("ID: "+rs.getInt(1)+ "Name: "+rs.getString(2)+"PRICE: "+rs.getInt(3));
		}
		
		ResultSetMetaData rsd = (ResultSetMetaData) rs.getMetaData();
		System.out.println(rsd.getColumnCount());
		System.out.println(rsd.getColumnClassName(1));
		System.out.println(rsd.getColumnName(1));

	}

}
