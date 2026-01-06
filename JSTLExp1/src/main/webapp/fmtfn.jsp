<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
  <%@ taglib uri="jakarta.tags.fmt" prefix="fmt" %>  
  <%@ taglib uri="jakarta.tags.functions" prefix="fn" %>
    <%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Format and Function Tags</h1>

<c:set var="balance" value="34234.3232"></c:set>

<fmt:parseNumber var="parsenum" type="number" value="${balance}"> </fmt:parseNumber>
<c:out value="${parsenum}"></c:out>

<c:set var="today" value="<%= new Date() %>"></c:set>
<br><br>
<c:out value="${today}"></c:out>

<fmt:formatDate  var="date" pattern="dd-mm-yyyy" value="${today}" />
<fmt:formatDate  var="time" type="time" value="${today}" />
<strong>
<br><br>
<br><br>
<fmt:formatDate   type="both" value="${today}" />
</strong>
<strong>
<br><br>
<c:out value="${time}"></c:out>
<c:out value="${date}"></c:out>
</strong>

<br><br>
 
<c:set var="data" value="This is an JSP example"></c:set>
 
<c:if test="${fn:containsIgnoreCase(data, 'JSP') }">
<c:out value="${data}"></c:out>
<p>The above data containsIgnoreCase JSP word</p>
</c:if>
 
 


</body>
</html>