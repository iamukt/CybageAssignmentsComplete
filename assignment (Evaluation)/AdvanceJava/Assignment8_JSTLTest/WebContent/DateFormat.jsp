<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" import="java.util.*"%>
<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:set var="today" value="<%=new Date()%>"></c:set>
	
	Time : <fmt:formatDate type="time" value="${today}"/><br>
	Date : <fmt:formatDate type="date" value="${today}"/><br>
	Both : <fmt:formatDate type="both" value="${today}"/><br><br>
	
	Short  Short  : <fmt:formatDate type="both" value="${today}" timeStyle="short" dateStyle="short"/><br>
	Short  Medium : <fmt:formatDate type="both" value="${today}" timeStyle="short" dateStyle="medium"/><br>
	Short  Long   : <fmt:formatDate type="both" value="${today}" timeStyle="short" dateStyle="long"/><br><br>
	
	Medium Short  : <fmt:formatDate type="both" value="${today}" timeStyle="medium" dateStyle="short"/><br>
	Medium Medium : <fmt:formatDate type="both" value="${today}" timeStyle="medium" dateStyle="medium"/><br>
	Medium Long   : <fmt:formatDate type="both" value="${today}" timeStyle="medium" dateStyle="long"/><br><br>
	
	Long   Short  : <fmt:formatDate type="both" value="${today}" timeStyle="long" dateStyle="short"/><br>
	Long   Medium : <fmt:formatDate type="both" value="${today}" timeStyle="long" dateStyle="medium"/><br>
	Long   Long   : <fmt:formatDate type="both" value="${today}" timeStyle="long" dateStyle="long"/><br><br>
	
	Format(yyyy-MM-dd) : <fmt:formatDate pattern="yyyy-MM-dd" value="${today}"/><br>
	
</body>
</html>