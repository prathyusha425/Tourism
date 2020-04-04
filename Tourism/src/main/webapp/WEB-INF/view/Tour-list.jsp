<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tour List</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style3.css">
</head>
<body>

<table>
		<tr>
			<td>Name</td>
			<td>From Location</td>
			<td>To Location</td>
			<td>NoOfDays</td>
			<td>Price</td>
			<td>Action</td>
		</tr>
		<c:forEach var="tempTours" items="${tourList}">
		
		<c:url var="updateLink" value="/tour/showFormForUpdate">
				<c:param name="tourId" value="${tempTours.id}"></c:param>
			</c:url>
		<c:url var="deleteLink" value="/tour/deleteTour">
				<c:param name="tourId" value="${tempTours.id}"></c:param>
			</c:url>
		
			<tr>
				<td>${tempTours.name}</td>
				<td>${tempTours.fromLocation}</td>
				<td>${tempTours.toLocation}</td>
				<td>${tempTours.noOfDays}</td>
				<td>${tempTours.price}</td>
				<td><a href="${updateLink}">Update</a>|
				<a href="${deleteLink}" onclick="if(!(confirm('Are you sure to delete'))) return false">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
		<p align="center">
		<a href="http://localhost:8080/Tourism/">Back to
			Home</a>
	</p>
</body>
</html>