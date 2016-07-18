<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="#">
	C<input type="checkbox" name="lang" value="C"><br>
	C++<input type="checkbox" name="lang" value="C++"><br>
	java<input type="checkbox" name="lang" value="java"><br>
	js<input type="checkbox" name="lang" value="js"><br>
	perl<input type="checkbox" name="lang" value="perl"><br>
	python<input type="checkbox" name="lang" value="python"><br>
	php<input type="checkbox" name="lang" value="php"><br>
	<input type="submit" value="Submit"> 
</form>

Selected Languages
<c:forEach var="mylang" items="${paramValues.lang}">
	${mylang} ,
</c:forEach>
</body>
</html>