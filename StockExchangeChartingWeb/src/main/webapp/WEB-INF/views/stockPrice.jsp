<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Stock price table</title>
</head>

<body>
	<table border="1">
		<tr>
			<th>Id</th>
			<th>CompanyId</th>
			<th>CurrentPrice</th>
			<th>openDateTime</th>


		</tr>
		<c:forEach var="stockPrice" items="${list}">
			<tr>
				<td>${stockPrice.id }</td>
				<td>${stockPrice.companyId }</td>
				<td>${stockPrice.currentPrice }</td>
				<td>${stockPrice.openDateTime }</td>


			</tr>
		</c:forEach>
	</table>

</body>
</html>