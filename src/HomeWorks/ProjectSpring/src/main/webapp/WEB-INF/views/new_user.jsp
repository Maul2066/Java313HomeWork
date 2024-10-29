<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>new_user</title>
</head>
<body>
<div>
    <h1>Новый сотрудник</h1>

    <form action="save" method="post">
        <table>
            <tr>
                <td>Name</td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td>Email</td>
                <td><input type="text" name="email"></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><input type="text" name="address"></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Save"></td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
