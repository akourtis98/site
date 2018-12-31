<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>Product Name</th>
        <th>Category</th>
        <th>Condition</th>
        <th>Price</th>
    </tr>
    </thead>
    <tr>
        <td>${product.prodName}</td>
        <td>${product.prodCategory}</td>
        <td>${product.prodCondition}</td>
        <td>${product.prodPrice}</td>
    </tr>
</table>
</body>
</html>