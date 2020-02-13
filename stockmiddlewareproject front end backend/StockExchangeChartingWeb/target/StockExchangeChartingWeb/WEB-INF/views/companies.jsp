<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%-- <%@ page isELIgnored="false"%> --%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:url var="companyUrl" value="/company/save"/>
	<form:form action="${companyUrl}" modelAttribute="company">
		<table>
		<c:if test="${!empty company.name }">
		<tr>
				<td><form:label path="id">Id</form:label></td>
				<td><form:input path="id" readOnly="true" disabled="true" />
				<form:hidden path="id" />
				</td>
			</tr>
		
		</c:if>
			<tr>
				<td><form:label path="name">Name</form:label></td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td><form:label path="turnover">Turn Over</form:label></td>
				<td><form:input path="turnover" /></td>
			</tr>
			<tr>
				<td><form:label path="ceo">CEO</form:label></td>
				<td><form:input path="ceo" /></td>
			</tr>
			<tr>
				<td><form:label path="sector">Sector</form:label></td>
				<td><form:input path="sector" /></td>
			</tr>
			<tr>
				<td></td>
				<td>
				<c:if test="${empty company.name}"><input type="submit" value="Register"></c:if>
				<c:if test="${!empty company.name}"><input type="submit" value="Update"></c:if></td>
			</tr>
		</table>
	</form:form>
	<br />
	<br />
	<div>
	<h2> Company Details</h2>
		<table border="1">
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Turn Over</th>
				<th>CEO</th>
				<th>Sector</th>
				<th>Actions</th>
			</tr>
			<c:forEach var="company" items="${list}">
				<tr>
					<td>${company.id }</td>
					<td>${company.name }</td>
					<td>${company.turnover }</td>
					<td>${company.ceo }</td>
					<td>${company.sector }</td>
					<td><a href="<c:url value='/remove/${company.id }' />">Remove</a>|
					<a href="<c:url value='/update/${company.id }' />">Update</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</body>
</html>