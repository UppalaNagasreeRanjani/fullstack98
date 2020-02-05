<%@include file="header.jsp" %>
<c:out value="helloworld"/>
<c:set var="name" value="nagasri"/>
<c:out value="${name }"/>
<c:remove var="name"/>
<br/>
name:<c:out value="${name }"/>
<%-- Loop :<br/>
<c:forEach var="i" begin="1" end="6" step="1">
<h2>${ i}</h2></c:forEach>
--%>
Lopp with array:<br/>
<c:forEach var="i" items="1,3,4,56,78,67">
<h2>${ i}</h2>
</c:forEach>
<<c:set var="result" value="100"></c:set>
<c:if test="${ result>80}">
<h2>my result is<c:out value="${result }"></c:out>
</h2>
</c:if>
<c:url value="/register.jsp" var="completeURL">  
 <c:param name="trackingId" value="786"/>  
 <c:param name="user" value="Nakul"/>  
</c:url>
${completeURL}    
<%-- <c:set var="url" value="0" scope="request"/>
<c:if test="${url<1}">  
<c:redirect url="http://facebook.com"/>  
</c:if>--%>
<c:set var="income" scope="session" value="${4000*4}"/>  
<p>Your income is : <c:out value="${income}"/></p>  
<c:choose>  
    <c:when test="${income <= 1000}">  
       Income is not good.  
    </c:when>  
    <c:when test="${income > 10000}">  
        Income is very good.  
    </c:when>  
    <c:otherwise>  
       Income is undetermined...  
    </c:otherwise>  
</c:choose> 
 <br/>

<c:url value="/Register.jsp"/>  
</body>
</html>