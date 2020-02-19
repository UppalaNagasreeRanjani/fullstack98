<%@ include file="header.jsp"%>

<h2>${message}</h2>
<hr>

<table class="table table-striped table-hover table-light">
	<tr>
		<th>id</th>
		<th>breif</th>
		<th>contactDetails</th>
		<th>remarks</th>
		<th>stockExhange</th>
	</tr>
	<tbody>
		<c:forEach var="exchange" items="${exchange }">

			<tr>
				<td>${exchange.id }</td>
				<td>${exchange.breif}</td>
				<td>${exchange.contactDetails }</td>
				<td>${exchange.remarks}</td>
				<td>${exchange.stockExhange }</td>
			</tr>

		</c:forEach>
	</tbody>
</table>

</body>
</html>