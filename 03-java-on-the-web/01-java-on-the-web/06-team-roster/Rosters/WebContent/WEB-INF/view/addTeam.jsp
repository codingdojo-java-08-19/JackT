<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Add Team</title>
</head>
<body>
	<h1>Create a new Team</h1>
	<form method="post" action="/Rosters/AddTeam">
		Team Name: <input type="text" name="name" >
		<button type="submit" >Create</button>
	</form>
</body>
</html>