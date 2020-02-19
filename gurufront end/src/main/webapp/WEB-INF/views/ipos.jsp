<%@include file="header.jsp"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h2 class="display-4 text-center">Enter IPO Details</h2>

<c:url var="ipoUrl" value="/ipo/save" />

<div class="container p-5">
	<form:form action="${ipoUrl }" modelAttribute="ipoDetails">

		<c:if test="${!empty ipoDetails.companyName }">
			<div class="form-group">
				<form:label path="id">id</form:label>
				<form:input path="id" class="form-control" readonly="true"
					disabled="true" />
				<form:hidden path="id" />
			</div>
		</c:if>

		<div class="row">
			<div class="form-group col">
				<form:label path="stockExchange">stockExchange</form:label>
				<form:input path="stockExchange" class="form-control" />
			</div>
			<div class="form-group col">
				<form:label path="companyName">companyName</form:label>
				<form:input path="companyName" class="form-control" />
			</div>
		</div>
		<div class="row">
			<div class="form-group col">
				<form:label path="opendateTime">opendateTime</form:label>
				<form:input path="opendateTime" class="form-control" />
			</div>
			<div class="form-group col	">
				<form:label path="priceperShare">priceperShare</form:label>
				<form:input path="priceperShare" class="form-control" />
			</div>
		</div>
		<div class="form-group">
			<form:label path="totalNoOfShares">totalNoOfShares</form:label>
			<form:input path="totalNoOfShares" class="form-control" />
		</div>
		<div class="form-group">
			<form:label path="remarks">remarks</form:label>
			<form:input path="remarks" class="form-control" />
		</div>

		<div class="text-center">
			<c:if test="${empty ipoDetails.companyName}">
				<input type="submit" value="Register" class="btn btn-success w-25 ">
			</c:if>
			<c:if test="${!empty ipoDetails.companyName}">
				<input type="submit" value="Update" class="btn btn-success w-25">
			</c:if>
		</div>
	</form:form>
</div>

<h2 class="display-4 text-center">IPO Details</h2>
<div class="container p-5">
	<table class="table table-light table-hover table-striped">
		<tr>
			<th>ID</th>
			<th>Company Name</th>
			<th>Open Date Time</th>
			<th>Price Per Share</th>
			<th>Remarks</th>
			<th>Stock Exchange</th>
			<th>Total No. of Shares</th>
			<th>Actions</th>
		</tr>
		<tbody>
			<c:forEach var="ipo" items="${ipo }">
				<tr>
					<td>${ipo.id }</td>
					<td>${ipo.companyName }</td>
					<td>${ipo.opendateTime }</td>
					<td>${ipo.priceperShare }</td>
					<td>${ipo.remarks }</td>
					<td>${ipo.stockExchange }</td>
					<td>${ipo.totalNoOfShares }</td>
					<td><a href="<c:url value='/remove-ipo/${ipo.id }'/>">Remove</a>
						| <a href="<c:url value='/update-ipo/${ipo.id }'/>">Update</a></td>
				</tr>
			</c:forEach>
		</tbody>

	</table>
</div>

</body>
</html>