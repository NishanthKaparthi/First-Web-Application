<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>First JSP</title>
</head>
<body>
	<p><font color = red>${errorMsg}</font></p>
	<form action="/login.do" method = "Post">
		Enter name <input type = "text" name = "name"> 
		Enter Password <input type = "password" name = "password">
		<input type = "submit" value = "Logn">
	</form>
</body>
</html>