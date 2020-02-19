<%@ include file="header.jsp"%>

<h2>${message }</h2>
<hr>

<table class="table table-light table-hover table-striped"">
	<tr>
		<th>Company Code</th>
		<th>Stock Exchange</th>
		<th>Current Price</th>
		<th>Date</th>
		<th>Time</th>
	</tr>
	<tbody>
		<c:forEach var="price" items="${prices }">
			<tr>
				<td>${price.companyCode }</td>
				<td>${price.stockExchange }</td>
				<td>${price.currentPrice }</td>
				<td>${price.date }</td>
				<td>${price.time}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>

</body>
</html>