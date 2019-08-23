<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Add Song</title>
</head>
<body>
	<form:form action="/process/new" method="post" modelAttribute="song">
		<div>
			<form:label path="title">Title: </form:label>
			<form:errors path="title"/>
			<form:input path="title"/>
		</div>
		<div>
			<form:label path="artist">Artist: </form:label>
			<form:errors path="artist"/>
			<form:input path="artist"/>
		</div>
		<div>
			<form:label path="rating">Rating (1-10): </form:label>
			<form:errors path="rating"/>
			<form:select path="rating">
				<c:forEach var="index" begin="1" end="10">
					<form:option value="${ index }">${ index }</form:option>
				</c:forEach>
			</form:select>
		</div>
		<input type="submit" value="Add Song"/>
	</form:form>

</body>
</html>