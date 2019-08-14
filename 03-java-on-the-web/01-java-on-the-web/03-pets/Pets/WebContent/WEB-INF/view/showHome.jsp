<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<h1>Create a Dog</h1>
	<form method="post" action="/Pets/ShowDog.java">
		Name: <input type="text" name="name">
		Breed: <input type="text" name="breed">
		Weight: <input type="text" name="weight">
		<button type="submit">Submit</button>	
	</form>
	<h1>Create a Cat</h1>
	<form method="post" action="/Pets/ShowCat.java">
		Name: <input type="text" name="name">
		Breed: <input type="text" name="breed">
		Weight: <input type="text" name="weight">
		<button type="submit">Submit</button>	
	</form>
</body>
</html>