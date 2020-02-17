<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>Stock Exchange Operations</title>
</head>
<body>
<div class="container mt-5 w-50 card card-shadow shadow p-5 lg-5 bg-white rounded" >
	<c:url var="userUrl" value="/stockExchange/save"></c:url>
	<form:form action="${userUrl }" modelAttribute="stockExchange">
		<table>
			<c:if test="${!empty stockExchange.exchangeName}">
				<tr>
					<td><form:label path="id">Id</form:label></td>
					<td><form:input path="id" readonly="true" disabled="true"></form:input>
						<form:hidden path="id" /></td>
				</tr>
			</c:if>
			<tr>
				<td><form:label path="exchangeName">Exchange Name</form:label></td>
				<td><form:input path="exchangeName"></form:input></td>
			</tr>
			<tr>
				<td><form:label path="contractAddress">Contact Address</form:label></td>
				<td><form:input path="contractAddress"></form:input></td>
			</tr>
			<tr>
				<td><form:label path="brief">Brief</form:label></td>
				<td><form:input path="brief"></form:input></td>
			</tr>
			<tr>
				<td><form:label path="remarks">Remarks</form:label></td>
				<td><form:input path="remarks"></form:input></td>
			</tr>

			<tr>
				<td></td>
				<td><c:if test="${empty stockExchange.exchangeName }">
						<input type="submit" class="btn btn-primary" value="submit">
					</c:if> <c:if test="${!empty stockExchange.exchangeName }">
						<input type="submit" class="btn btn-primary" value="update">
					</c:if></td>
			</tr>
		</table>
	</form:form>
	</div>
	<br>

	<table class="table table-striped">
		<tr>
			<th>Id</th>
			<th>ExchangeName</th>
			<th>ContractAddress</th>
			<th>Brief</th>
			<th>Remarks</th>
			<th>Actions</th>
		</tr>
		<c:forEach var="stockExchange" items="${list}">
			<tr>
				<td>${stockExchange.id }</td>
				<td>${stockExchange.exchangeName }</td>
				<td>${stockExchange.contractAddress }</td>
				<td>${stockExchange.brief }</td>
				<td>${stockExchange.remarks }</td>
				<td><a
					href="<c:url value='/stockExchange/remove/${stockExchange.id }'/>">Remove</a> |
					<a
					href="<c:url value='/stockExchange/update/${stockExchange.id }'/>">Update</a></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>