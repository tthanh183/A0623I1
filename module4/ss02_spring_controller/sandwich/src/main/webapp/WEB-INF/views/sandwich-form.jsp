<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 2/10/2024
  Time: 11:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sandwich Form</title>
</head>
<body>
<form action="/sandwich" method="post">
    <h2>Select Condiments:</h2>
    <c:forEach var="condiment" items="${condiments}">
        <label>
            <input type="checkbox" name="selectedCondiments" value="${condiment}"/> ${condiment}<br/>
        </label>
    </c:forEach>
    <br/>
    <button type="submit">Submit</button>
</form>
</body>
</html>
