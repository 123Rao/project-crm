<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Billing</title>
</head>
<body>
		<h2>Billing</h2>
		<form action="savebill" method ="post" >
	
		<pre>
		<input type="hidden" name="id" value="${contact.id}">
		FirstName<input type="text" name="firstname" value="${contact.firstname}">
		LastName<input type="text" name="lastname" value="${contact.lastname}">
		Email<input type="text" name="email" value="${contact.email}">
		Mobile<input type="text" name="mobile" value="${contact.mobile}">	
		Lead Source<input type="text" name="leadSource" value="${contact.leadSource}">		
		Product Name<input type="text" name="productname">
		Amount<input type="text" name="amount">
		<input type="Submit" value="save">
		</pre>
		</form>
	
</body>
</html>