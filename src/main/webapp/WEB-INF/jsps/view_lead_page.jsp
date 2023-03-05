<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Registration</title>
</head>
<body>
		<h2>Create Registration</h2>
		<form action="savelead "method="post" >
		<pre>
		FirstName<input type="text" name="firstname">
		LastName<input type="text" name="lastname">
		Email<input type="text" name="email">
		Mobile<input type="text" name="mobile">	
		Address<input type="text" name="address">			
		LeadSource:<select name="leadSource">
		  <option value="radio">Radio</option>
		  <option value="tv">TV</option>
		  <option value="trade show">Trade show</option>
		  <option value="news paper">News paper</option>
		</select>
		Male<input type="radio"  name="gender" value="male">
		Female<input type="radio"  name="gender" value="female">
		<input type="Submit" value="save">
		</pre>
		</form>		
		
		
</body>
</html>