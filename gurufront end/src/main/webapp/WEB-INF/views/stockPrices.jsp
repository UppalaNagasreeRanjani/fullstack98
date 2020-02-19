<%@include file="header.jsp"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h2 class="display-4 text-center">Enter Stock Price Details</h2>

<c:url var="stockPriceUrl" value="/stockPrice/save" />

<div class="container p-5">
	<form:form action="${stockPriceUrl }" modelAttribute="stockPrice">

		<c:if test="${!empty stockPrice.stockExchange}">

			<div class="form-group">
				<form:label path="companyCode">companyCode</form:label>
				<form:input path="companyCode" class="form-control" readOnly="true"
					disabled="true" />
				<form:hidden path="companyCode" />
			</div>


		</c:if>

		<div class="row">
			<div class="form-group col">
				<form:label path="currentPrice">currentPrice</form:label>
				<form:input path="currentPrice" class="form-control" />
			</div>
		</div>
		<div class="form-group">
			<form:label path="date">date</form:label>
			<form:input path="date" class="form-control" />
		</div>
		<div class="form-group">
			<form:label path="stockExchange">stockExchange</form:label>
			<form:input path="stockExchange" class="form-control" />
		</div>
		<div class="form-group">
			<form:label path="time">time</form:label>
			<form:input path="time" class="form-control" />
		</div>

		<div class="text-center">
			<c:if test="${empty stockPrice.stockExchange }">
				<input type="submit" value="Register" class="btn btn-success w-25">
			</c:if>
			<c:if test="${!empty stockPrice.stockExchange }">
				<input type="submit" value="Update" class="btn btn-success w-25">
			</c:if>
		</div>
	</form:form>

</div>

<h2 class="text-center display-4">Stock Price Details</h2>

<div class="container p-5">
	<table class="table table-striped table-hover table-light">

		<tr>
			<th>companyCode</th>
			<th>currentPrice</th>
			<th>date</th>
			<th>stockExchange</th>
			<th>time</th>
			<th>Actions</th>
		</tr>

		<tbody>
			<c:forEach var="price" items="${price }">
				<tr>
					<td>${price.companyCode }</td>
					<td>${price.currentPrice }</td>
					<td>${price.date }</td>
					<td>${price.stockExchange }</td>
					<td>${price.time }</td>
					<td><a
						href="<c:url value="remove-stockPrice/${price.companyCode }"/>">Remove</a>
						| <a
						href="<c:url value="update-stockPrice/${price.companyCode }"/>">Update</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>

	</table>
</div>


</body>
</html>