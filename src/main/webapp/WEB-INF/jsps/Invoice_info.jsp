<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 	  <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Invoice</title>
</head>
<body>
		<h2>Invoice</h2>
		Id:${contacts.id}<br/>
		First name:${contacts.firstname}<br/>
		Last name:${contacts.lastname}<br/>
		Lead Source:${contacts.leadSource}<br/> 
		Email:${contacts.email}<br/>
		Mobile:${contacts.mobile }<br/>
		ProductName:${contacts.productname}<br/>
		Amount:${contacts.amount}<br/>
</body>
</html>