<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
         <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
       <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update Lead</title>
</head>
<body>
		<h2>update Lead</h2>
		<form action="updatelist" method ="post" >
		<pre>
		<input type="hidden" name="id" value="${lead.id}">
		FirstName<input type="text" name="firstname" value="${lead.firstname}">
		LastName<input type="text" name="lastname" value="${lead.lastname}">
		Email<input type="text" name="email" value="${lead.email}">
		Mobile<input type="text" name="mobile" value="${lead.mobile}">		
		Address<input type="text" name="Address" value="${lead.address}">		
		<input type="Submit" value="Save">
		</pre>
		</form>
</body>
</html>