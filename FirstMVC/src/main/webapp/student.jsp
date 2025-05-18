<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Read Student data</h1>
	<form action="student" method="post">
		<input type="number" placeholder="Sid" name="sid"><br>
		<input type="text" placeholder="Name" name="name"><br>
		<input type="email" placeholder="Email" name="email"><br>
		<input type="text" placeholder="Standard" name="std"><br>
		<input type="submit" value="Submit">
	</form>
</body>
</html>