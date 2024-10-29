<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>edit_user</title>
</head>
<body>
<div>
    <h1>Редактировать сотрудника</h1>
    <form action="/updateUser" method="post">
        <input type="hidden" name="id" value="${editUser.id}">
        <table>
            <tr>
                <td>Name</td>
                <td><input type="text" name="name" value="${editUser.name}"></td>
            </tr>
            <tr>
                <td>Email</td>
                <td><input type="text" name="email" value="${editUser.email}"></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><input type="text" name="address" value="${editUser.pass}"></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Update"></td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
