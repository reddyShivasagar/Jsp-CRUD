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
<% Hospital hospital=(Hospital)request.getAttribute("Hospital"); %>
<form action="updatehospital" method="post">

	ID:<input type="text" placeholder="enter id" name="id"><br><br> 
    NAME:<input type="text" placeholder="Enter name" name="name"><br><br>
	WEBSITE:<input type="text" placeholder="Enter website" name="website"><br><br>
	PHONE:<input type="text" placeholder="Enter phoneno" name="phoneno"><br><br>
	
	<input type="submit" value="UPDATE RESULT">
</form>

</body>
</html>