<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="saveUser" method="post" modelAttribute="userObject">
		<form:label path="userId">UserID</form:label>
		<form:input path="userId" placeholder ="Enter your Id"/><br><br>
		
		<form:label path="userName">UserName</form:label>
		<form:input path="userName" placeholder ="Enter your Name"/><br><br>
		
		<form:label path="userEmail">UserEmail</form:label>
		<form:input path="userEmail" placeholder ="Enter your Email"/><br><br>
		
		<form:label path="userPhone">UserPhone</form:label>
		<form:input path="userPhone" placeholder ="Enter your phone"/><br><br>
		
		<input type="submit" type="submit">	
	</form:form>
</body>
</html>