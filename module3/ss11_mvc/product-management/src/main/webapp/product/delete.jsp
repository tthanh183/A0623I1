<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 1/11/2024
  Time: 9:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete product</title>
</head>
<body>
<h1>Delete customer</h1>
<p>
    <a href="/products">Back to customer list</a>
</p>
<form method="post">
    <h3>Are you sure?</h3>
    <fieldset>
        <legend>Product information</legend>
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
            <tr>
                <td><input type="submit" value="Delete product"></td>
                <td><a href="/products">Back to product list</a></td>
            </tr>
        </table>
    </fieldset>
</body>
</html>
