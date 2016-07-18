<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="Calc">
	Number1:&nbsp;&nbsp;<input type="text" name="number1">
	<br><br>
	Number2:&nbsp;&nbsp;<input type="text" name="number2">
	<br><br>
	<input type="radio" name="operation" value="add">Addition
	<br><br>
	<input type="radio" name="operation" value="sub">Subtraction
	<br><br>
	<input type="radio" name="operation" value="mul">Multiplication
	<br><br>
	<input type="radio" name="operation" value="div">Division
	<br><br>
	<input type="submit">
	</form>
</body>
</html>