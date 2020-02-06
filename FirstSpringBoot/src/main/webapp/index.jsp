<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   <%@page import="com.firstspringb.model.Psycho" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
</head>

<body>
<form action="addpsycho">
<input type="text" name="pid" id="id">
<input type="text" name="pname" id ="name">
<input type="submit" Value="submit">
</form>

<table border="1">
<thead>
<tr>
<th>Psycho Id</th>
<th>Psycho Name</th>
</tr>
</thead>
<tbody>
	
 


<%--	<% ForEach(Psycho p :psycho)
	{ %>

<c:forEach items="${psycho}" var="p">
<tr>
<td>${p.pid}</td>
<td>${p.pname}</td>
<tr>
</c:forEach>
 

<% } --%>

</tbody>
</table>
</body>
</html>