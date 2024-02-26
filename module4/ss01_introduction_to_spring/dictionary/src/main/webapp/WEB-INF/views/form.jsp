<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 2/7/2024
  Time: 3:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dictionary</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css">
</head>
<body class="container-fluid">
<h1>Dictionary</h1>
<form action="/diction" method="post">
    <div class="mb-3">
        <label for="exampleFormControlInput1" class="form-label">Enter an word</label>
        <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="" name="key">
    </div>
    <div class="mb-3">
        <label for="exampleFormControlInput2" class="form-label">Result</label>
        <input type="text" class="form-control" id="exampleFormControlInput2" placeholder="" readonly value="${result}">
    </div>
    <input class="btn btn-primary" type="submit" value="Submit">
</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
