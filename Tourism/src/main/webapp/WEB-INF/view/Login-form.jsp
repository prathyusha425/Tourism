<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style1.css">
</head>
<body>
	<div class="title">
		<h1>Sign In Form</h1>
	</div>
	<div class="container">
		<div class="left"></div>
		<div class="right">
			<div class="formbox">
				<form:form action="validateUser" modelAttribute="user" method="POST">
					<p>Username</p>
					<form:input path="username" />
					<p>Password</p>
					<form:input path="password" />
					<br>
					<br>
					<input type="submit" name="sub1" value="Login">
					<br>
				</form:form>
				<p>New account</p>
				<input type="button" onclick="window.location.href = 'showFormForAdd'; return false;" value="Signup">
			</div>
		</div>
	</div>
</body>
</html>