<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Checkerboard.jsp</title>
	<style>
	
	div.little {height: 20px; width: 20px; display: inline-block; margin: 0px;}
	</style>
</head>
<body>
	<%	String h = request.getParameter("height");
		String w = request.getParameter("width");
		%>
	<%! Integer hi =0;
		Integer wi =0;
	%>
	<%	hi = Integer.parseInt(h);
		wi = Integer.parseInt(w);	
	%>
	<% System.out.println(h); %>
	<% System.out.println(hi); %>
	
	<% System.out.println("we are not in there"); %>
	<% for(int i=0; i< hi; i++) { %>
		<% System.out.println("big loops"); %>
		<div>
		<% for (int j=0;j<wi;j++) { %>
			<% if((i+j)%2 == 1) { %>
				<% System.out.println("red block"); %>
				<div  class="little" style="background-color: red"></div>
			<% } else { %>
				<% System.out.println("black block"); %>
				<div class="little" style="background-color: black" ></div>
			<% } %>
		<% } %>
		</div>
	<% } %>
	

</body>
</html>