<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
  <%@ taglib uri="jakarta.tags.core" prefix="c" %>
  
  <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:set var="age" value="${12}"></c:set>
<c:out value="${age}"></c:out>

<c:if test="${age == 18}">
<c:out value="eligible"></c:out>
</c:if>
<c:choose>
<c:when test="${age == 18}">
<c:out value="eligible"></c:out>
</c:when>
<c:otherwise>
<c:out value="bada hoke aa"></c:out>
</c:otherwise>
</c:choose>
<c:out value="${age}"></c:out>
<c:remove var="age"></c:remove>
<c:out value="${age}"></c:out>

<c:forEach var="i" begin="1" end="10">
<c:out value="${i}"></c:out>
</c:forEach>
<c:forTokens items="Vidhan,jay,ishita,ram,shyam" delims="," var="team">
<c:out value="${team}"></c:out>
</c:forTokens>
</body>
</html>