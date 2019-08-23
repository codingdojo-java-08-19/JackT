<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Search</title>
</head>
<body>
	<form:form action="/process/search" method="post" modelAttribute="song">
		<div>
		<form:label path="artist">Songs by artist: <c:out value="${ artist }"/></form:label>
			<form:errors path="artist"/>
			<form:input path="artist"/>
		</div>
		<input type="submit" value="New Search"/>
	</form:form>
	<a href="/dashboard">Dashboard</a>
	<table>
		<tr>
			<th>Title</th>
			<th>Artist</th>
			<th>actions</th>
		</tr>
	<c:forEach var="song" items="${ songs }" >
		<tr>
			<td><a href="/song/<c:out value="${ song.getId() }"/>"><c:out value="${ song.getTitle() }" /></a></td>
			<td><c:out value="${ song.getArtist() }" /></td>
			<td><a href="/delete/<c:out value="${ song.getId() }"/>">delete</a>
		</tr>
	</c:forEach>
	</table>
</body>
</html>