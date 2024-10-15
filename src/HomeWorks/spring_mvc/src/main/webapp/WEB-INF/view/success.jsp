<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h2>Данные пользователя</h2>
<hr>
<ul>
    <li>Имя: ${user.Name1}</li>
    <li>Фамилия: ${user.Name2}</li>
    <li>Отчество: ${user.Name3}</li>
    <li>Возраст: ${user.age}</li>
    <li>Email: ${user.email}</li>
    <li>Пароль: ${user.password}</li>
</ul>
</body>
</html>
