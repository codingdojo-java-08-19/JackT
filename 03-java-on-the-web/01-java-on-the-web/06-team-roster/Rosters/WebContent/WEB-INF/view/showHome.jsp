<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Roster</title>
</head>
<body>
	<h1>Roster</h1>
	<a href="/Rosters/Teams" >New Team</a>
	<table>
	<tr>
		<th>Team</th>
		<th>Players</th>
		<th>Action</th>
	</tr>
	<c:forEach var="team" items="${ roster.teams }">
	<tr>
		<td><c:out value="${team.getName()}" /></td>
		<td><c:out value="${team.players.size() }" /></td>
		<td><a href="/Rosters/Players?id=<c:out value='${team.getId()}' />">Details</a> <a href="/Rosters/DeleteTeam?id=<c:out value='${team.getId()}' />">Delete</a></td> 
	</tr>
	</c:forEach>
	</table>
</body>
</html>