<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 1/11/2024
  Time: 10:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product detail</title>
</head>
<body>
<h1>Product details</h1>
<p>
    <a href="/products">Back to product list</a>
</p>
<table>
    <tr>
        <td>Name: </td>
        <td>${requestScope["product"].name}</td>
    </tr>
    <tr>
        <td>Price: </td>
        <td>${requestScope["product"].price}</td>
    </tr>
    <tr>
        <td>Quantity: </td>
        <td>${requestScope["product"].quantity}</td>
    </tr>
    <tr>
        <td>Image: </td>
        <td>${requestScope["product"].image}</td>
    </tr>
</table>
</body>
</html>
