<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 1/11/2024
  Time: 7:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product List</title>
</head>
<body>
<h1>Product List</h1>
<p>
    <a href="/products?action=create">Create new product</a>
</p>
<table border="1" style="text-align: center">
    <thead>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Price</th>
            <th>Quantity</th>
            <th>Image</th>
            <th>Detail</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
    </thead>
    <tbody>
    <c:forEach items="${requestScope['products']}" var="product">
        <tr>
            <td>${product.id}</td>
            <td>${product.name}</td>
            <td><fmt:formatNumber value="${product.price}" type="currency"/></td>
            <td>${product.quantity}</td>
            <td><img src="img/${product.image}" style="width: 200px; height: 150px"></td>
            <td><a href="/products?action=view&id=${product.id}">Detail</a></td>
            <td><a href="/products?action=edit&id=${product.id}">Edit</a></td>
            <td><a href="/products?action=delete&id=${product.id}">Delete</a></td>
        </tr>
    </c:forEach>

    </tbody>
</table>
</body>
</html>
