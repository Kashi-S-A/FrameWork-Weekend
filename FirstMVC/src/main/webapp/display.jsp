<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Person Details</h1>
	
	<h3>PID : ${PersonId}</h3>
	<h3>Name : ${PersonName}</h3>
	<h3>Phone : ${PersonMobile}</h3>
	
	<hr>
	
	<h3>Pid : <%=request.getAttribute("PersonId") %></h3>
	<h3>Name : <%=request.getAttribute("PersonName") %></h3>
	<h3>Phone : <%=request.getAttribute("PersonMobile") %></h3>
	
</body>
</html>