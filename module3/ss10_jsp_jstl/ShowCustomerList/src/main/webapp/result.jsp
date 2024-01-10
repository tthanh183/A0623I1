<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 1/10/2024
  Time: 6:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="dist/css/bootstrap.css">
</head>
<body>
<div class="container">
    <table class="table">
        <thead>
        <tr>
            <th scope="col">Tên</th>
            <th scope="col">Ngày Sinh</th>
            <th scope="col">Địa chỉ</th>
            <th scope="col">Ảnh</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${customerList}" var ="customer">
            <tr>
                <td>${customer.name}</td>
                <td>${customer.dob}</td>
                <td>${customer.address}</td>
                <td><img src="img/${customer.img}" style="width: 100px"></td>
            </tr>
        </c:forEach>

        </tbody>
    </table>
</div>

<script src="dist/js/bootstrap.js"></script>
</body>
</html>
