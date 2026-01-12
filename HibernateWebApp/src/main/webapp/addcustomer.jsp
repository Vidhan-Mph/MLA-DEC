<%@page import="com.test.dao.CustomerDAO"%>
<%@page import="com.test.dao.Customer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ADD CUSTOMER</title>
</head>
<body>

	com.test.spring.model.Customer cst = new com.test.spring.model.Customer();
	
	<%
		String fname= request.getParameter("firstName");
		String lname= request.getParameter("lastName");
		String loc= request.getParameter("location");
		
		Customer obj = new Customer();
		obj.setFirstName(fname);
		obj.setLastName(lname);
		obj.setLocation(loc);
		
		CustomerDAO.addCustomer(obj);
// 		out.println(obj);
		out.println("<h3>Successfully added Customer</h3>");
	%>
	
	
</body>
</html>