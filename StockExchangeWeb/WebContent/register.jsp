<%@include file="header.jsp" %>
<%String name=request.getParameter("user");  
String pass=request.getParameter("pass");
out.print("welcome "+name);
out.print("welcome "+pass);


%>


</body>
</html>