<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<h1>Login Page</h1>
	<p style="color: red;">${errorMessage}</p>
	<form action="${pageContext.request.contextPath}/HomeServlet/loginMember" method="post">
		<p> <label>Name:&nbsp;<input name="name" required/> </label> </p>
		<p> <label>Password:&nbsp;<input name="password" type="password" required/> </label> </p>
		<p> <input type="submit" value="Login" /> <input type="reset"/></p>
	</form>
	
	<a href="${pageContext.request.contextPath}/HomeServlet/showRegistration">Register Here</a>
</body>
</html>