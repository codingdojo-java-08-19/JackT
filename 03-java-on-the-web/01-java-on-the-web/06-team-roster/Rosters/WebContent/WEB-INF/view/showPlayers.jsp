<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Team</title>
</head>
<body>
	<h1><c:out value="${team.getName()}"/></h1>
	<a href="/Rosters/CreatePlayer" >New <c:out value="${team.getName()}"/></a>
	<table>
	<tr>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Age</th>
		<th>Action</th>
	</tr>
	<c:forEach var="player" items="${ team.players }">
	<tr>
		<td><c:out value="${player.getFname()}" /></td>
		<td><c:out value="${player.getLname() }" /></td>
		<td><c:out value="${player.getAge() }" /></td>
		<td><a href="/Rosters/DeletePlayer?id=<c:out value='${player.getId()}' />">Delete</a></td> 
	</tr>
	</c:forEach>
	</table>
</body>
</html>