<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>User-Data</h1>
	<table border="2px">
		<tr>
			<th>UserID</th>
			<th>UserName</th>
			<th>UserEmail</th>
			<th>UserPhone</th>
			<th colspan="2">Action</th>
		</tr>
		
		<c:forEach var="user" items="${allUser}">
			<tr>
				<td>${user.getUserId()}</td>
				<td>${user.getUserName()}</td>
				<td>${user.getUserEmail()}</td>
				<td>${user.getUserPhone()}</td>
				<td><a href=""><button style="color:yellow; background-color: red;">delete</button></td>
				<td><a href=""><button style="color:yellow; background-color: red;">update</button></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>