<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:url value='j_spring_security_check' var="loginUrl"/>

<html>
   <body>
      <h1>Login</h1>
      <c:if test="${not empty error}">
         <p>${error}</p>
      </c:if>
      <form action="${loginUrl}" method="POST">
         <label>Username:</label>
         <input type="text" name="j_username">
         <label>Password</label>
         <input type="password" name="j_password">
         <br />
         <input type="submit" value="Submit" />
      </form>
   </body>
</html>

