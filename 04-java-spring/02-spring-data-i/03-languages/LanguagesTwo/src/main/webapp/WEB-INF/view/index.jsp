<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Languages</title>
</head>
<body>
	<table>
		<tr>
			<th>Name</th>
			<th>Creator</th>
			<th>Version</th>
			<th>Action</th>
		</tr>
	<c:forEach var="language" items="${ languages }" >
		<tr>
			<td><a href="/languages/<c:out value="${language.id}" />"><c:out value="${language.name}" /></a></td>
			<td><c:out value="${language.creator}" /></td>
			<td><c:out value="${language.version}" /></td>
			<td><a href="/languages/<c:out value="${language.id}" />/delete">delete</a> <a href="/languages/<c:out value="${language.id}" />/edit">edit</a></td>
		</tr>	
	</c:forEach>
	</table>
	
	<form:form action="/languages/new" method="post" modelAttribute="language">
		<div>
			<form:label path="name">Name</form:label>
			<form:errors path="name"/>
			<form:input path="name"/>
		</div>
		<div>
			<form:label path="creator">Creator</form:label>
			<form:errors path="creator"/>
			<form:input path="creator"/>
		</div>
		<div>
			<form:label path="version">Version</form:label>
			<form:errors path="version"/>
			<form:input path="version"/>
		</div>
		<input type="submit" value="Submit"/>
	</form:form>

</body>
</html>