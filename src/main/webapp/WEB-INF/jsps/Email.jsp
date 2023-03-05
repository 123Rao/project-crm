<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Email Form</title>
  </head>
  <body>
    <form action="emaildetails" method="post">
      <label for="to">To:</label>
      <input type="text" name="to" value="${lead.email}"><br><br>
      <label for="subject">Subject:</label>
      <input type="text" name="subject"><br><br>
      <label for="message">Message:</label><br>
      <textarea id="message" name="message" rows="10" cols="50" required></textarea><br><br>
      <input type="submit" value="Send">
    </form>
  </body>
</html>