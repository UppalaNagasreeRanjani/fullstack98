<%@include file="header.jsp" %>

<br>
<%=getSum(3,5) %>
<%!
public static int getSum(int a, int b){
	return a+b;
}
%>

</body>
</html>