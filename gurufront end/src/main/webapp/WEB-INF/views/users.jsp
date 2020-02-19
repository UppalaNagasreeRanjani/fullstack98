<%@include file="header.jsp"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h2 class="display-4 text-center">Enter User Details</h2>
<c:url var="userUrl" value="/user/save" />

<div class="container p-5">
	<form:form action="${userUrl }" modelAttribute="user">

		<c:if test="${!empty user.username}">
			<div class="form-group">
				<form:label path="id">ID</form:label>
				<form:input path="id" class="form-control" readonly="true"
					disabled="true"></form:input>
				<form:hidden path="id"/>
			</div>
		</c:if>

		<div class="row">
			<div class="form-group col">
				<form:label path="username">User Name</form:label>
				<form:input path="username" class="form-control"></form:input>
			</div>
			<div class="form-group col">
				<form:label path="userType">User Type</form:label>
				<form:input path="userType" class="form-control"></form:input>
			</div>
		</div>
		<div class="row">
			<div class="form-group col">
				<form:label path="password">password</form:label>
				<form:input path="password" class="form-control"></form:input>
			</div>
			<div class="form-group col">
				<form:label path="email">E-mail</form:label>
				<form:input path="email" class="form-control"></form:input>
			</div>
		</div>
		<div class="form-group">
			<form:label path="phone">Phone</form:label>
			<form:input path="phone" class="form-control"></form:input>
		</div>

		<div class="text-center">
			<c:if test="${empty user.username }">
				<input type="submit" value="Register" class="btn btn-success w-25">
			</c:if>
			<c:if test="${!empty user.username }">
				<input type="submit" value="update" class="btn btn-success w-25">
			</c:if>
		</div>
	</form:form>
</div>



<h2 class="display-4 text-center">User Details</h2>
<div class="container p-5">

	<table class="table table-light table-hover table-striped">
		<tr>
			<th>ID</th>
			<th>E-Mail</th>
			<th>Password</th>
			<th>Phone</th>
			<th>User Type</th>
			<th>Username</th>
			<th>Actions</th>
		</tr>
		<tbody>
			<c:forEach var="user" items="${list }">
				<tr>
					<td>${user.id }</td>
					<td>${user.email }</td>
					<td>${user.password }</td>
					<td>${user.phone }</td>
					<td>${user.userType }</td>
					<td>${user.username }</td>
					<td><a href="<c:url value='/remove/${user.id }' />">Remove</a>
						| <a href="<c:url value='/update/${user.id }' />">Update</a></td>
				</tr>

			</c:forEach>
		</tbody>
	</table>
</div>


</body>
</html>