<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Регистрация пользователя</h1>
<form action="createUser" method="post">
    <p>
        <label for="Name1">Имя: </label>
        <input type="text" name="Name1" id="Name1">
    </p>
    <p>
        <label for="Name2">Фамилия: </label>
        <input type="text" name="Name2" id="Name2">
    </p>
    <p>
        <label for="Name3">Отчество: </label>
        <input type="text" name="Name3" id="Name3">
    </p>
    <p>
        <label for="age">Возраст: </label>
        <input type="text" name="age" id="age">
    </p>
    <p>
        <label for="email">Email: </label>
        <input type="email" name="email" id="email">
    </p>
    <p>
        <label for="password">Пароль: </label>
        <input type="password" name="password" id="password">
    </p>
        <button>Регистрация</button>
    </p>
</form>
</body>
</html>
