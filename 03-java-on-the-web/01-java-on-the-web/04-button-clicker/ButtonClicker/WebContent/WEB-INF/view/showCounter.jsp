<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Counter</title>
</head>
<body>
	<a href="/ButtonClicker/Counter"><button>Click Me!</button></a>
	<h1>You have clicked this button <c:out value="${count}"/> </h1>
</body>
</html>