<%@ include file="header.jsp" %>
	
	<h2>${message }</h2>
	<hr>
	<%-- <ol>
		<c:forEach var="name" items="${list }">
			<li><h3>${name }</h3></li>
		</c:forEach>
	</ol> --%>

<table class="table table-light table-hover table-striped">
	<tr>
		<th>ID</th>
		<th>E-Mail</th>
		<th>Password</th>
		<th>Phone</th>
		<th>User Type</th>
		<th>Username</th>
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
			</tr>

		</c:forEach>
	</tbody>
</table>
</body>
</html>

