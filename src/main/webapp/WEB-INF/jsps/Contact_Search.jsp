<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
     <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact list</title>
</head>
<body>
		
		<h2>Contact details</h2>
		<table border="1">
		<tr>
			<th>ID/No</th>
			<th>First name</th>
			<th>Last name</th>
			<th>Email</th>
			<th>LeadSource</th>	
			<th>Mobile</th>
			<th>Gender</th>	
			<th>Delete</th>	
			<th>Update</th>	
			<th>Billing</th>
			<th>Contact Details</th>
						
		</tr>
		<c:forEach items = "${contact}" var ="lead">
		
		<tr>
			
			<td>${lead.id}</td>  
			<td>${lead.firstname}</td>                                           
			<td>${lead.lastname}</td>
			<td>${lead.email}</td>
			<td>${lead.leadSource}</td>	
			<td>${lead.mobile}</td>	
			<td>${lead.gender}</td>	
			<td><a href="getcontactsid?id=${lead.id}" >Delete</a></td>  	
			<td><a href="generateupdateid?id=${lead.id}">Update</a></td>	
			<td><a href="generateBillid?id=${lead.id}">Billing</a></td>
			<td><a href="getcontactsinfoid?id=${lead.id}">Contact Details</a></td>					
		</tr>

		</c:forEach>
		</table>

</body>
</html>