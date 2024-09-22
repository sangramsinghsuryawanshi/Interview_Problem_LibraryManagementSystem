<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file="header.jsp" %>
	<form action="/addbook" method="post">
		<h2>Add Book</h2>
		<lable>Book Title: </lable>
		<input type="text" name="title" placeholder="Enter book title.." required="required"><br><br>
		<lable>Book Author: </lable>
		<input type="text" name="author" placeholder="Enter book author.." required="required"><br><br>
		<lable>Book Title: </lable>
		<input type="number" name="quantity" placeholder="Enter book quantity.." required="required"><br><br>
		<button type="submit" >submit</button>
	</form>
	<h2>${msg}</h2>
</body>
</html>