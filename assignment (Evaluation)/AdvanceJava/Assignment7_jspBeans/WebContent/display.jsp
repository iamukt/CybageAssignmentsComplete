<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display</title>
</head>
<body>
	<%!int i=0; %>
	<jsp:useBean id="customer" class="beans.Customer" scope="session"/>
	<jsp:setProperty property="id" name="customer" value="<%=++i%>"/>
	<jsp:setProperty property="*" name="customer"/>
	Id:&nbsp;&nbsp;<jsp:getProperty property="id" name="customer"/>
	<br><br>First Name:&nbsp;&nbsp;<jsp:getProperty property="firstName" name="customer"/>
	<br><br>Last Name:&nbsp;&nbsp;<jsp:getProperty property="lastName" name="customer"/>
	<br><br>Contact No:&nbsp;&nbsp;<jsp:getProperty property="contactNo" name="customer"/>
	<br><br>Address:&nbsp;&nbsp;<jsp:getProperty property="address" name="customer"/>
</body>
</html>