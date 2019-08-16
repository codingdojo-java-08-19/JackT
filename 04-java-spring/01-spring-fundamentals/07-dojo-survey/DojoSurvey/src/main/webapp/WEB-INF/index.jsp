<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Create</title>
</head>
<body>
<c:out value="${ error }" />
<form method="post" action="/create">
	Your Name: <input type="text" name="name" >
	Dojo Location: <input type="text" name="location" >
	Favorite Language: <input type="text" name="language" >
	Comment (optional): <input type="text" name="comment" >
	<button>Button</button>
</form>

</body>
</html>