<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Names</title>
</head>
<body>

<form:form action="/rest/names/" method="POST" modelAttribute="user">
    <form:input path="name"/>
    <input type="submit" value="Send"/>
</form:form>

<c:forEach var="userVar" items="${users}">
    <c:out value="${userVar.name}"/>
</c:forEach>
</body>
</html>
