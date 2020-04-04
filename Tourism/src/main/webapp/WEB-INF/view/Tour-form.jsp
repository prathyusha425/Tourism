<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Tour</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style2.css">
</head>
<body>
	<div align="center">
		<br>
		<h1>-->Tour System --</h1>
		<br>

		<div style="margin: 30px">
			<h2>-- User Registration Form --</h2>
			<br>
			<form:form action="saveTour" modelAttribute="tour" method="POST">
				<form:hidden path="id" />
				<table>
					<tbody>
						<tr>
							<td><label>Name:</label></td>
							<td><form:input path="name" /></td>
							<td><form:errors path="name" cssClass="error" /></td>
						</tr>
						<tr>
							<td><label>From Location:</label></td>
							<td><form:input path="fromLocation" /></td>
							<td><form:errors path="fromLocation" cssClass="error" /></td>
						</tr>
						<tr>
							<td><label>To Location:</label></td>
							<td><form:input path="toLocation" /></td>
							<td><form:errors path="toLocation" cssClass="error" /></td>
						</tr>
						<tr>
							<td><label>No Of Days:</label></td>
							<td><form:input path="noOfDays" /></td>
							<td><form:errors path="noOfDays" cssClass="error" /></td>
						</tr>
						<tr>
							<td><label>Price:</label></td>
							<td><form:input path="price" /></td>
							<td><form:errors path="price" cssClass="error" /></td>
						</tr>
						<tr>
							<td><label></label></td>
							<td><input type="submit" value="Save" class="save"></td>
						</tr>
					</tbody>
				</table>
			</form:form>
		</div>
	</div>
	<p>
		<a href="${pageContext.request.contextPath}/tour/list">Back to
			List</a>
	</p>
</body>
</html>