<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Great NUmber Game</title>
	<style>
		div {
			height: 200px;
			width: 200px;
			margin: auto;
		}
	</style>
</head>
<body>
	<h1>The Great Number Game</h1>
	<c:if test = "${firstguess == false }">
	<div style="background-color: <c:out value="${color}" />">
		<h2><c:out value="${phrase}" /></h2>
		
		<c:if test="${incorrect == false}">
		<form method="POST" action="/GreatNumberGame/Process">
			<input type="hidden" name="reset" value=true>
			<button type="submit">Play Again!</button>
		</form>
		</c:if>
	</div>
	</c:if>
	<c:if test = "${incorrect == true}">
	<form method="POST" action="/GreatNumberGame/Process"> 
		Guess: <input type="text" name="gnum">
		<button type="submit">Submit</button>
	</form>
	</c:if>
</body>
</html>