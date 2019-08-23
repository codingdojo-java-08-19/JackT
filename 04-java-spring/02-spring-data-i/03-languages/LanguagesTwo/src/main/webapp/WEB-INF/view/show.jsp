<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Show</title>
</head>
<body>
	<a href="/languages">dashboard</a>
	<c:out value="${language.name}" />
	<c:out value="${language.creator}" />
	<c:out value="${language.version}" />
	<a href="/languages/<c:out value="${language.id}"/>/edit">Edit</a>
	<a href="/languages/<c:out value="${language.id}"/>/delete">Delete</a>
</body>
</html>