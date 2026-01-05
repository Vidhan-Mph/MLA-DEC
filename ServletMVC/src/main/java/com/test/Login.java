package com.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String usr=request.getParameter("user");
		String pas=request.getParameter("pwd");
		String sql="select u_name,u_password from user1 where u_name='"+usr+"' ";
		
		User obj=new User();
		Statement stmt=null;
		try {
		
			stmt=DBConnection.getCon().createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next())
			{
				obj.setUsername(rs.getString(1));
				obj.setPassword(rs.getString(2));
				
			}
		if(usr.equals(obj.getUsername()) && pas.equals(obj.getPassword()))
		{
			out.println("<h3> login success...</h3>");
		}
		else
		{
			out.println("<h3> invalid credentials </h3>");
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
