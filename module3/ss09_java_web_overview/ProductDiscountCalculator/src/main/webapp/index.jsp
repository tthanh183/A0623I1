<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="dist/css/bootstrap.css">
</head>

<body>
<div class="container">
    <form class="row g-3" action="/discount" method="post">
        <div class="mb-3">
            <label for="exampleFormControlTextarea1" class="form-label">Product Description</label>
            <textarea class="form-control" id="exampleFormControlTextarea1" rows="3" name="describe"></textarea>
        </div>
        <div class="mb-3">
            <label for="formGroupExampleInput2" class="form-label">List Price</label>
            <input type="text" class="form-control" id="formGroupExampleInput2" name = "price"
                   placeholder="List Price">
        </div>
        <div class="mb-3">
            <label for="formGroupExampleInput" class="form-label">Discount Percent</label>
            <input type="text" class="form-control" id="formGroupExampleInput" name="percent"
                   placeholder="Discount Percent">
        </div>
        <input class="btn btn-primary" type="submit" value="Submit">
    </form>
</div>


<script src="dist/js/bootstrap.js"></script>
</body>

</html>