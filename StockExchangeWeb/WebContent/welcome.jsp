
<%@include file="header.jsp" %>

<%   
String name=request.getParameter("user");  
out.print("welcome "+name);  
String password=request.getParameter("pass");  
out.print("welcome "+password);  

%> 

</body>
</html>