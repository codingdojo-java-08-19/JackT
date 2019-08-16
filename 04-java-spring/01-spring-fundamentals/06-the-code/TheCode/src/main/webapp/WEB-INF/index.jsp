<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Secret Code</title>
</head>
<body>
	<p style="color: red"><c:out value="${ error }" /></p>
	<h1>What is the code?</h1>
	<form method="POST" action="/test">
		<input type="text" name="code">
		<button>Try Code</button>
	</form>
</body>
</html>