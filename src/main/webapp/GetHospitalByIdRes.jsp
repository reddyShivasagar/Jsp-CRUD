<%@page import="com.hospital.dto.Hospital"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%Hospital hospital=(Hospital)request.getAttribute("idnumber"); %>
<table>
<tr>
           <th>ID</th>
           <th>NAME</th>
           <th>WEBSITE</th>
           <th>PHONENO</th>

</tr>

<%if(hospital !=null){ %>

<tr>
<td><%=hospital.getId() %></td>
<td><%=hospital.getName() %></td>
<td><%=hospital.getWebsite() %></td>
<td><%=hospital.getPhoneno() %></td>
</tr>
<%
} 
%>
</table>

</body>
</html>