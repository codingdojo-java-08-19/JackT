<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Top Ten</title>
</head>
<body>
	<a href="/dashboard">Dashboard</a>
	<h1>Top Ten Songs: </h1>
	<table>
		<tr>
			<th>Rating</th>
			<th>Title</th>
			<th>Artist</th>
		</tr>
	<c:forEach var="song" items="${ topTen }" >
		<tr>
			<td><c:out value="${ song.getRating() }" /></td>
			<td><a href="/song/<c:out value="${ song.getId() }"/>"><c:out value="${ song.getTitle() }" /></a></td>
			<td><c:out value="${ song.getArtist() }" /></td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>