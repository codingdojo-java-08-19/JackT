<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Ninja Gold Game</title>
	
	
	
	
</head>
<body>
	<h1>Your Gold: </h1>
	<input type="text" value="<c:out value="${ gold }" />" readonly>
	<div>
		<h2>Farm</h2>
		<h3>(earns 10-20 gold)</h3>
		<a href="/Gold/calc?name=farm"><button>Find Gold!</button></a>
	</div>
	<div>
		<h2>Cave</h2>
		<h3>(earns 5-10 gold)</h3>
		<a href="/Gold/calc?name=cave"><button>Find Gold!</button></a>	
	</div>
	<div>
		<h2>House</h2>
		<h3>(earns 2-5 gold)</h3>
		<a href="/Gold/calc?name=house"><button>Find Gold!</button></a>	
	</div>
	<div>
		<h2>Casino</h2>
		<h3>(earns/takes 0-50 gold)</h3>
		<a href="/Gold/calc?name=casino"><button>Find Gold!</button></a>		
	</div>
	
	<h1>Activities:</h1>
	
	<div>
	<c:forEach var="comment" items="${ log }">
		<p><c:out value="${ comment }" /></p>
	</c:forEach>
	</div>

</body>
</html>