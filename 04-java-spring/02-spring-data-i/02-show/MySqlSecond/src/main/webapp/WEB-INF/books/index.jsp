<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Books</title>
</head>
<body>
	<h1>Here are all the books</h1>
	<table>
		<tr>
			<th>Title</th>
			<th>Pages</th>
			<th>Desc</th>
			<th>Lang</th>		
		</tr>
		<c:forEach var="book" items="${books}">
		<tr>
			<td>${book.getTitle()}</td>
			<td>${book.getNumberOfPages()}</td>
			<td>${book.getDescription()}</td>
			<td>${book.getLanguage()}</td>
			
		</tr>
		</c:forEach>
	</table>
</body>
</html>
