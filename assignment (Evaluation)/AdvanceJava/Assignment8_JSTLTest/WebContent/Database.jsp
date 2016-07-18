<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<sql:setDataSource var="myDBSrc" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/java_fr_db" user="root" password="root"/>

<sql:query var="myquery" dataSource="${myDBSrc}" >
	select * from employee
</sql:query>

<table>
<c:forEach var="emp" items="${myquery.rows}">
	<tr>	
		<td> <c:out value="${emp.empid}"></c:out></td>
		<td> <c:out value="${emp.empname}"></c:out></td>
		<td> <c:out value="${emp.salary}"></c:out></td>
		<td> <c:out value="${emp.city}"></c:out></td>
	</tr>	
</c:forEach>
</table>
</body>
</html>