<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<html>
<body>
<h1>Form</h1>
<c:if test="${not empty errormessage}">
    ${errormessage}
</c:if>
<form action="form" method="POST">
First Name: <input type="text" name="page">
<br />
<input type="submit" value="Submit" />
</form>
</body>
</html>

