<%@page import="com.hospital.dto.Hospital"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table{

text-align: center;
}
th{
font-style: oblique;
color: black;
}
td{
color: blue;
font-style: itall;
}
</style>
</head>
<body>
<% List<Hospital> list=(List<Hospital>)request.getAttribute("addlist");%>
<table border="3px">
<tr>
    <th>ID</th>
    <th>NAME</th>
    <th>WEBSITE</th>
    <th>PHONENO</th>
    <th>UPDATE</th>
    <th>DELETE</th>
</tr>

<% for(Hospital hospital:list){ %>
<tr>

<td><%=hospital.getId() %></td>
<td><%=hospital.getName() %></td>
<td><%=hospital.getWebsite() %></td>
<td><%=hospital.getPhoneno() %></td>
<td><a href="edit?id=<%= hospital.getId()%>">Edit</a></td>
<td><a href="deletehospitalbyid?id=<%= hospital.getId() %>">Delete</a></td>
</tr>
<%
}
%>
</table>
</body>
</html>