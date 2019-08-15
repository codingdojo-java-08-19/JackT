<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Add Player</title>
</head>
<body>
	<h1>Add a player to Team <c:out value="${team.name }" /></h1>
	<form method="post" action="/Rosters/AddPlayer?id=<c:out value="team.getId()" />" >
		First Name: <input type="text" name="fname" >
		Last Name: <input type="text" name="lname" >
		Age: <select name="age">
			<c:forEach var="i" begin="18" end="40">
			<option value="<c:out value="${ i }" />"><c:out value="${i}" /></option>
			</c:forEach>
		</select>
		<button type="submit" >Create</button>
	</form>
</body>
</html>