<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>ector Operations</title>
</head>
<body>
<div class="container mt-5 w-50 card card-shadow shadow p-5 lg-5 bg-white rounded" >
	<c:url var="userUrl" value="/sector/save"></c:url>
	<form:form action="${userUrl }" modelAttribute="sector">
		<table>
			<c:if test="${!empty sector.name}">
				<tr>
					<td><form:label path="id">Id</form:label></td>
					<td><form:input path="id" readonly="true" disabled="true"></form:input>
						<form:hidden path="id" /></td>
				</tr>
			</c:if>

			<tr>
				<td><form:label path="name">Sector Name</form:label></td>
				<td><form:input path="name"></form:input></td>
			</tr>
			<tr>
				<td><form:label path="brief">Brief</form:label></td>
				<td><form:input path="brief"></form:input></td>
			</tr>



			<tr>
				<td></td>
				<td><c:if test="${empty sector.name }">
						<input type="submit" class="btn btn-primary" value="submit">
					</c:if> <c:if test="${!empty sector.name }">
						<input type="submit" class="btn btn-primary" value="update">
					</c:if></td>
			</tr>
		</table>
	</form:form>
	</div>
	<br>
	<br>
	<table class="table table-striped">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Brief</th>
			<th>Actions</th>
		</tr>
		<c:forEach var="sector" items="${list}">
			<tr>
				<td>${sector.id }</td>
				<td>${sector.name }</td>
				<td>${sector.brief }</td>
				<td><a href="<c:url value='/sector/remove/${sector.id }'/>">Remove</a> |
					<a href="<c:url value='/sector/update/${sector.id }'/>">Update</a></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>