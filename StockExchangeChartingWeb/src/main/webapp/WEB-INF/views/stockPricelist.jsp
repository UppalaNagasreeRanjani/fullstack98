<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>Stock Price Operations</title>
</head>
<body>
<div class="container mt-5 w-50 card card-shadow shadow p-5 lg-5 bg-white rounded" >
	<c:url var="userUrl" value="/stockPrice/save"></c:url>
	<form:form action="${userUrl}" modelAttribute="stockPrice">
		<table>
			<c:if test="${!empty stockPrice.openDateTime}">
				<tr>
					<td><form:label path="id">Id</form:label></td>
					<td><form:input path="id" readonly="true" disabled="true"></form:input>
						<form:hidden path="id" /></td>
				</tr>
			</c:if>

			<tr>
				<td><form:label path="companyId">Company Id</form:label></td>
				<td><form:input path="companyId"></form:input></td>
			</tr>
			<tr>
				<td><form:label path="currentPrice">Current Price</form:label></td>
				<td><form:input path="currentPrice"></form:input></td>
			</tr>
			<tr>
				<td><form:label path="openDateTime">Date Time</form:label></td>
				<td><form:input type="datetime-local" path="openDateTime"></form:input></td>
			</tr>


			<tr>
				<td></td>
				<td><c:if test="${empty stockPrice.openDateTime }">
						<input type="submit" class="btn btn-primary" value="submit">
					</c:if> <c:if test="${!empty stockPrice.openDateTime }">
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
			<th>CompanyId</th>
			<th>CurrentPrice</th>
			<th>Date</th>
			<th>Time</th>

		</tr>
		<c:forEach var="stockPrice" items="${list}">
			<tr>
				<td>${stockPrice.id }</td>
				<td>${stockPrice.companyId }</td>
				<td>${stockPrice.currentPrice }</td>
				<td>${stockPrice.openDateTime }</td>

				<td><a
					href="<c:url value='/stockPrice/remove/${stockPrice.id }'/>">Remove</a> |
					<a href="<c:url value='/stockPrice/update/${stockPrice.id }'/>">Update</a></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>