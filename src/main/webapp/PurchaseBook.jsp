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
	<form action="/prbook" method="post">
		<h2>Book</h2>
		<lable>Book Title: </lable>
		<input type="text" name="addBook" placeholder="Enter book title.." required="required"><br><br>
		<lable>Quantity: </lable>
		<input type="number" name="borrowBook" placeholder="Enter book author.." required="required"><br><br>
		<lable>Return policy: </lable>
		<input type="text" name="returnBook" placeholder="Enter Yes or no"><br><br>
		<button type="submit" >submit</button>
	</form>
	<h2>${msg}</h2>
</body>
</html>