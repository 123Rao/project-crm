<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
       <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead List</title>
</head>
<body>
		<h2>Lead List</h2>
		<table border="1">
		<tr>
			<th>ID/NO</th>
			<th>First name</th>
			<th>Last name</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Delete</th>
			<th>Update</th>
			<th>Email</th>
			<th>Lead Details</th>			
		</tr>
		<c:forEach items = "${leads}" var ="lead">
		
		<tr>
			<td>${lead.id}</td>				
			<td>${lead.firstname}</td>
			<td>${lead.lastname}</td>
			<td>${lead.email}</td>
			<td>${lead.mobile}</td>	
			<td><a href="deleteleadid?id=${lead.id}">Delete</a></td>
			<td><a href="updateleadid?id=${lead.id}">Update</a></td>		
			<td><a href="EmailleadByemail?email=${lead.email}">Email</a></td>		
			<td><a href="getleadByid?id=${lead.id}">Lead Details</a></td>					
							
		</tr>

		</c:forEach>
		</table>
</body>
</html>