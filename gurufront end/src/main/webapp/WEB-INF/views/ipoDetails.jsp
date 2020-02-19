<%@ include file="header.jsp"%>

<h2>${message}</h2>
<hr>

<table class="table table-light table-hover table-striped">
	<tr>
		<th>ID</th>
		<th>Company Name</th>
		<th>Open Date Time</th>
		<th>Price Per Share</th>
		<th>Remarks</th>
		<th>Stock Exchange</th>
		<th>Total No. of Shares</th>
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
			</tr>
		</c:forEach>
	</tbody>

</table>
</body>
</html>