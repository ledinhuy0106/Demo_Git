<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<form action="http://localhost:8080/sum" method="post">
    <input type="text" name="a">
    <input type="text" name="b">
    <button>nhap</button>
</form>

</body>
</html>