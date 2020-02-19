<%@include file="header.jsp"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h2 class="display-4 text-center">Enter Stock Exchange Details</h2>

<c:url var="exchangeUrl" value="/exchange/save" />

<div class="container p-5">
	<form:form action="${exchangeUrl }" modelAttribute="stockExchange">

		<c:if test="${!empty stockExchange.stockExhange}">
			<div class="form-group">
				<form:label path="id">id</form:label>
				<form:input path="id" class="form-control" readonly="true"
					disabled="true"></form:input>
				<form:hidden path="id" />
			</div>
		</c:if>

		<div class="form-group">
			<form:label path="breif">breif</form:label>
			<form:input path="breif" class="form-control"></form:input>
		</div>
		<div class="form-group">
			<form:label path="contactDetails">contactDetails</form:label>
			<form:input path="contactDetails" class="form-control"></form:input>
		</div>
		<div class="form-group">
			<form:label path="remarks">remarks</form:label>
			<form:input path="remarks" class="form-control"></form:input>
		</div>
		<div class="form-group">
			<form:label path="stockExhange">stockExhange</form:label>
			<form:input path="stockExhange" class="form-control"></form:input>
		</div>
		<div class="text-center">
			<c:if test="${empty stockExchange.stockExhange}">
				<input type="submit" value="Register" class="btn btn-success w-25">
			</c:if>
			<c:if test="${!empty stockExchange.stockExhange}">
				<input type="submit" value="Update" class="btn btn-success w-25">
			</c:if>
		</div>
	</form:form>
</div>


<h2 class="display-3 text-center">Stock Exchange</h2>
<div class="container p-5">
	<table class="table table-striped table-hover table-light">
		<tr>
			<th>id</th>
			<th>breif</th>
			<th>contactDetails</th>
			<th>remarks</th>
			<th>stockExhange</th>
			<th>Actions</th>
		</tr>
		<tbody>
			<c:forEach var="exchange" items="${exchange}">
				<tr>
					<td>${exchange.id }</td>
					<td>${exchange.breif}</td>
					<td>${exchange.contactDetails }</td>
					<td>${exchange.remarks}</td>
					<td>${exchange.stockExhange }</td>
					<td><a href="<c:url value='/remove-exchange/${exchange.id}'/>">Remove</a>
						| <a href="<c:url value='/update-exchange/${exchange.id}'/>">Update</a>
					</td>
				</tr>

			</c:forEach>
		</tbody>
	</table>
</div>

</body>
</html>