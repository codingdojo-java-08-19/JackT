<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title><c:out value="${ name }" /></title>
</head>
<body>
	<div>
		<a href="">Dashboard</a>
		<a href="">Delete</a>
	</div>
	
	<form:form action="/languages/edit/process" method="post" modelAttribute="language">
		<div>
			<form:input type="hidden" path="id" value="${ id }" /> 
			<form:label path="name">Name</form:label>
			<form:errors path="name"/>
			<form:input path="name" value="${ name }"/>
		</div>
		<div>
			<form:label path="creator">Creator</form:label>
			<form:errors path="creator"/>
			<form:input path="creator" value="${ creator }"/>
		</div>
		<div>
			<form:label path="version">Version</form:label>
			<form:errors path="version"/>
			<form:input path="version" value="${ version }"/>
		</div>
		<input type="submit" value="Submit"/>
	</form:form>

</body>
</html>