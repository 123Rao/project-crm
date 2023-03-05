<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead |info</title>
</head>
<body>
		<h2>Lead info</h2>
		Id:${lead.id}<br/>
		First name:${lead.firstname}<br/>
		Last name:${lead.lastname}<br/>
		Lead Source:${lead.leadSource}<br/>
		Email:${lead.email}<br/>
		Mobile:${lead.mobile }<br/>
		Gender:${lead.gender}<br/>
		Address:${lead.address}<br/>
		<form action="convertlead" method ="post">
		<input type ="hidden" name="id" value ="${lead.id}"/>
		<input type ="submit" value="convert"/>
		</form>
</body>
</html>