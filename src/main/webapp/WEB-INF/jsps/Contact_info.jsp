<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>contact info</title>
</head>
<body>
		<h2>contact info</h2>
		Id:${contact.id}<br/>
		First name:${contact.firstname}<br/>
		Last name:${contact.lastname}<br/>
		Lead Source:${contact.leadSource}<br/>
		Email:${contact.email}<br/>
		Mobile:${contact.mobile }<br/>
		Gender:${contact.gender}<br/>
		Address:${contact.address}<br/>
		
</body>
</html>