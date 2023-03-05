<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update contact</title>
</head>
<body>
		<h2>update contact</h2>
		<form action="updatecontact" method ="post" >
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