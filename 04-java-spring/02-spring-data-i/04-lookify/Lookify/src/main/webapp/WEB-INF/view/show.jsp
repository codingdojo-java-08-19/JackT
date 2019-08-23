<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title><c:out value="${ song.title }"/></title>
</head>
<body>
	<a href="/dashboard">Dashboard</a>
	Title: <c:out value="${ song.title }"/>
	Artist: <c:out value="${ song.artist }"/>
	Rating (1-10): <c:out value="${ song.rating }"/>
	<a href="/delete/<c:out value="${ song.getId() }"/>">delete</a>
</body>
</html>