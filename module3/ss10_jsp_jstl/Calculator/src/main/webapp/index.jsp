<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link rel="stylesheet" href="dist/css/bootstrap.css">
</head>
<body>
<h1>
</h1>
<br/>

<div class="container">
    <h2>Calculator</h2>
    <form action="/calculator" method="get">
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
</div>

<script src="dist/js/bootstrap.js"></script>

</body>
</html>