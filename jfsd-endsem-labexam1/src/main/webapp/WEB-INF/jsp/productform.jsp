<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/SpringMVC/productform" method="post">
    Product ID: <input type="text" name="productId"/><br/>
    Product Name: <input type="text" name="productName"/><br/>
    Price: <input type="text" name="price"/><br/>
    Description: <input type="text" name="description"/><br/>
    <input type="submit" value="Submit"/>
</form>

</body>
</html>