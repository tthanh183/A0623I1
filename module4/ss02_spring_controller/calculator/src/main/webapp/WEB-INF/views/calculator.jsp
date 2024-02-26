<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 2/10/2024
  Time: 11:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <h2>Calculator</h2>
    <form action="/calculator" method="post">
        <div class="form-group row">
            <label for="firstOperand" class="col-sm-2 col-form-label">First operand</label>
            <div class="col-sm-10">
                <input type="text" class="form-control " name="firstOperand" id="firstOperand" placeholder="First operand">
            </div>
        </div>

        <div class="form-group row">
            <label for="operator" class="col-sm-2 col-form-label">Operator:</label>
            <div class="col-sm-10">
                <select id = "operator" class="form-select form-select-lg mb-3 mt-3" name="operator" aria-label="Large select example">
                    <option value="+" selected>+</option>
                    <option value="-">-</option>
                    <option value="*">*</option>
                    <option value="/">/</option>
                </select>
            </div>
        </div>

        <div class="form-group row">
            <label for="secondOperand" class="col-sm-2 col-form-label">Second operand</label>
            <div class="col-sm-10">
                <input type="text" class="form-control " name="secondOperand" id="secondOperand" placeholder="Second operand">
            </div>
        </div>
        <input class="btn btn-primary" type="submit" value="Submit">
    </form>
    <c:if test="${result != null}">
        <span>Result: ${result}</span>
    </c:if>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</form>
</body>
</html>
