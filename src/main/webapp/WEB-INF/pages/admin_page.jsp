<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<html>
<body>
<h2>Admin page</h2>
Hello <security:authentication property="principal.username" />

</body>
</html>