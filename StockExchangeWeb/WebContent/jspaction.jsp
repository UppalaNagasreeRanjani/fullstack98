<%@include file="header.jsp" %>
<jsp:useBean id="user" class="com.cts.training.bean.LoginBean" scope="page">
</jsp:useBean>
<jsp:setProperty property="username" name="user" value="admin007"/>
<jsp:setProperty property="password" name="user" value="admin637gf"/>
<hr>
User details are:<br>
Username:<jsp:getProperty property="username" name="user"/>
Password:<jsp:getProperty property="password" name="user"/>