<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 2/10/2024
  Time: 11:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Selected sandwich condiments</title>
</head>
<body>
<h2>Selected Condiments:</h2>
<c:if test="${selectedCondiments != null}">
    <c:forEach var="condiment" items="${selectedCondiments}">
        <label>${condiment}<br/></label>
    </c:forEach>
</c:if>
</body>
</html>
