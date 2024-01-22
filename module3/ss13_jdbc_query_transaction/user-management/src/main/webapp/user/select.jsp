<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 1/15/2024
  Time: 7:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Management Application</title>
</head>
<body>
<center>
  <h1>User Management</h1>
  <form method="post">
    <h2>Find user by country</h2>
    <table border="1" cellpadding="5">
      <tr>
        <th>Country:</th>
        <td><input type="text" value="" name="country"></td>
      </tr>
      <tr>
        <td colspan="2" align="center"><input type="submit" value="Find"/></td>
      </tr>
    </table>
  </form>
</center>
<c:if test="${users != null}">
  <div align="center">
    <table border="1" cellpadding="5">
      <caption><h2>List of Users</h2></caption>
      <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
        <th>Country</th>
        <c:forEach var="user" items="${users}">
      <tr>
        <td><c:out value="${user.id}"/></td>
        <td><c:out value="${user.name}"/></td>
        <td><c:out value="${user.email}"/></td>
        <td><c:out value="${user.country}"/></td>
      </tr>
      </c:forEach>
    </table>
  </div>
</c:if>

</body>
</html>
