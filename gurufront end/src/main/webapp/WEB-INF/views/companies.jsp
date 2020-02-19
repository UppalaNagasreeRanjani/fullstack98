<%@include file="header.jsp"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h2 class="display-4 text-center">Enter Company Details</h2>
<c:url var="companyUrl" value="/company/save" />

<div class="container p-5">
	<form:form action="${companyUrl }" modelAttribute="company">

		<c:if test="${!empty company.companyName}">
			<div class="form-group">
				<form:label path="id">ID</form:label>
				<form:input path="id" class="form-control" readonly="true"
					disabled="true"></form:input>
				<form:hidden path="id" />
			</div>
		</c:if>

		<div class="row">
			<div class="form-group col">
				<form:label path="companyName">companyName</form:label>
				<form:input path="companyName" class="form-control"></form:input>
			</div>
			<div class="form-group col">
				<form:label path="city">city</form:label>
				<form:input path="city" class="form-control"></form:input>
			</div>
		</div>
		<div class="row">
			<div class="form-group col">
				<form:label path="state">state</form:label>
				<form:input path="state" class="form-control"></form:input>
			</div>
			<div class="form-group col">
				<form:label path="pincode">pincode</form:label>
				<form:input path="pincode" class="form-control"></form:input>
			</div>
		</div>
		<div class="form-group">
			<form:label path="turnover">turnover</form:label>
			<form:input path="turnover" class="form-control"></form:input>
		</div>
		<div class="form-group">
			<form:label path="aboutCompany">aboutCompany</form:label>
			<form:input path="aboutCompany" class="form-control"></form:input>
		</div>
		<div class="form-group">
			<form:label path="stockExchange">stockExchange</form:label>
			<form:input path="stockExchange" class="form-control"></form:input>
		</div>
		<div class="form-group">
			<form:label path="sector">sector</form:label>
			<form:input path="sector" class="form-control"></form:input>
		</div>

		<div class="text-center">
			<c:if test="${empty company.companyName }">
				<input type="submit" value="Register" class="btn btn-success w-25">
			</c:if>
			<c:if test="${!empty company.companyName }">
				<input type="submit" value="update" class="btn btn-success w-25">
			</c:if>
		</div>
	</form:form>
</div>



<h2 class="display-4 text-center">Company Details</h2>
<div class="container p-5">

	<table class="table table-light table-hover table-striped">
		<tr>
			<th>ID</th>
			<th>companyName</th>
			<th>city</th>
			<th>state</th>
			<th>pincode</th>
			<th>turnover</th>
			<th>aboutCompany</th>
			<th>stockExchange</th>
			<th>sector</th>
			<th>Actions</th>
		</tr>
		<tbody>
			<c:forEach var="company" items="${companyList }">
				<tr>
					<td>${company.id }</td>
					<td>${company.companyName }</td>
					<td>${company.city }</td>
					<td>${company.state }</td>
					<td>${company.pincode }</td>
					<td>${company.turnover }</td>
					<td>${company.aboutCompany }</td>
					<td>${company.stockExchange }</td>
					<td>${company.sector }</td>
					<td><a
						href="<c:url value='/remove-company/${company.id  }' />">Remove</a>
						| <a href="<c:url value='/update-company/${company.id  }' />">Update</a></td>
				</tr>

			</c:forEach>
		</tbody>
	</table>
</div>


</body>
</html>