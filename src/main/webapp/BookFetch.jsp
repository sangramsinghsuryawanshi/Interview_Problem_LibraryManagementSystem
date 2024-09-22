<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file="header.jsp" %>
	<table border="2">
		<tr>
			<th>Book Title</th>
			<th>Book Author</th>
			<th>Book Quantity</th>
		</tr>
		<c:forEach var="b" items="${book}">
			<tr>
				<td>${b.title}</td>
				<td>${b.author}</td>
				<td>${b.quantity}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>