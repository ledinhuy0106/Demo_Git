<%--
  Created by IntelliJ IDEA.
  User: Linh
  Date: 7/27/2023
  Time: 9:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<form action="http://localhost:8080/user?action=login" method="post">
    <input type="text" name="username">
    <input type="password" name="password">
    <button type="submit">Đăng nhập</button>
</form>
</body>
</html>
