<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>home</title>
</head>
<body>
<div>
    <h1>Менеджер по персоналу</h1>
    <c:if test="${not empty msg}">
        <h4>${msg}</h4>
        <c:remove var="msg" />
    </c:if>
    <h3><a href="/new">Новый сотрудник</a></h3>
    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Password</th>
            <th>Action</th>
        </tr>

        <c:forEach items="${UserList}" var="user">
            <tr>
                <td>${user.id}</td>
                <td>${user.name}</td>
                <td>${user.email}</td>
                <td>${user.pass}</td>
                <td class="last">
                    <a href="edit/${user.id}">Edit</a>
                    <a href="delete/${user.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
