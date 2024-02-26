<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 2/7/2024
  Time: 10:00 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Currency Conversion</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css">
</head>
<body class="container-fluid">
<h1>Currency Conversion - USD to VND</h1>
<form action="" method="post">
    <div class="mb-3">
        <label for="exampleFormControlInput1" class="form-label">Enter amount</label>
        <input type="number" step="any" class="form-control" id="exampleFormControlInput1" placeholder="" name="amount">
    </div>
    <div class="mb-3">
        <label for="exampleFormControlInput2" class="form-label">Result</label>
        <input type="number" class="form-control" id="exampleFormControlInput2" placeholder="" readonly value="${result}">
    </div>
    <input class="btn btn-primary" type="submit" value="Submit">
</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
