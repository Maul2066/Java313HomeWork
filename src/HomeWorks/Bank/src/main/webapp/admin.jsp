<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Admin</title>
    <link rel="stylesheet" href="CSS/style.css">
</head>
<body>
<div style="border-radius: 5px; background: linear-gradient(90deg, #b02424 0%, #751515 100%); height: 200px;"> <button style="color: #ff0000; width: 200px; height: 100px; background-color: black; border: solid 5px #2d2c2c; margin-top: 50px; border-radius: 5px; position: absolute; margin-left: 20px" id="GeneralMenu_ID"><h2 style="font-family: 'Bauhaus 93';">Bank</h2></button> <button style=" position: absolute; background-color: #726d6d; color: white; width: 160px; height: 40px; margin-left: 700px; border: black solid 5px; border-radius: 20px; margin-top: 70px;" id="AdminMenu_ID">АДМИНИСТРАТОР</button> <button style="background-color: #726d6d; color: white; width: 160px; height: 40px; margin-left: 900px; border: black solid 5px; border-radius: 20px; margin-top: 70px;" id="WorkerMenu_ID">РАБОТНИКИ</button> <button style=" position: absolute; background-color: #726d6d; color: white; width: 160px; height: 40px; margin-left: 50px; margin-top: 70px; border: black solid 5px; border-radius: 20px;" id="OtherMenu_ID">УСЛУГИ</button></div>
<form action="loginAdmin" method="post">
    <div style="border: solid black 5px; width: 450px; background-color: black; height: 450px; border: solid red; border-radius: 10px; margin-top: 50px; margin-left: 500px;">
        <h2 style="text-align: center; color: white;">Авторизация администратора</h2>
        <div style="margin-left: 100px; font-size: 20px; color: white; margin-top: 70px;">Эл.почта:</div>
        <input type="email" name="email" required style="margin-left: 100px; font-size: 20px; background-color: red; color: white; border: solid white 2px;"> <br> <br>
        <div style="margin-left: 100px; font-size: 20px; color: white;" >Пароль:</div>
        <input type="password" name="password" required style="margin-left: 100px; font-size: 20px; background-color: red; color: white; border: solid white 2px;">
        <button style="border: solid white 5px; border-radius: 5px; background-color: #b02424; font-weight: bold; font-family: 'Cooper Black'; width: 200px; height: 50px; margin-top: 80px; margin-left: 120px" >ВОЙТИ</button>
    </div>
</form>
<script src="JS/button.js"></script>
</body>
</html>
