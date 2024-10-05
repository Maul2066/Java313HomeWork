<%@ page import="java.sql.Connection" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>Bank</title>
  <link rel="stylesheet" href="CSS/style.css">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">
</head>
<body>
<div>
  <div style="background: linear-gradient(90deg, #b02424 0%, #751515 100%); height: 200px;"> <button style="color: #ff0000; width: 200px; height: 100px; background-color: black; border: solid 5px #2d2c2c; margin-top: 50px; border-radius: 5px; position: absolute; margin-left: 20px" id="GeneralMenu_ID"><h2 style="font-family: 'Bauhaus 93';">Bank</h2></button> <button style=" position: absolute; background-color: #726d6d; color: white; width: 160px; height: 40px; margin-left: 700px; border: black solid 5px; border-radius: 20px; margin-top: 70px;" id="AdminMenu_ID">АДМИНИСТРАТОР</button> <button style="background-color: #726d6d; color: white; width: 160px; height: 40px; margin-left: 900px; border: black solid 5px; border-radius: 20px; margin-top: 70px;" id="WorkerMenu_ID">РАБОТНИКИ</button> <button style=" position: absolute; background-color: #726d6d; color: white; width: 160px; height: 40px; margin-left: 50px; margin-top: 70px; border: black solid 5px; border-radius: 20px;" id="OtherMenu_ID">УСЛУГИ</button></div>


  <div id="carouselExampleAutoplaying" class="carousel slide" data-bs-ride="carousel">
    <div class="carousel-inner">
      <div class="carousel-item active">
        <img src="IMG/logo.png" class="d-block w-100" alt="...">
      </div>
      <div class="carousel-item">
        <img src="IMG/logo2.png" class="d-block w-100" alt="...">
      </div>
      <div class="carousel-item">
        <img src="IMG/logo3.png" class="d-block w-100" alt="...">
      </div>
    </div>
    <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleAutoplaying" data-bs-slide="prev">
      <span class="carousel-control-prev-icon" aria-hidden="true"></span>
      <span class="visually-hidden">Previous</span>
    </button>
    <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleAutoplaying" data-bs-slide="next">
      <span class="carousel-control-next-icon" aria-hidden="true"></span>
      <span class="visually-hidden">Next</span>
    </button>
  </div>


  <div style=" margin-left: 20px; margin-top: 20px;">
  <h2 style="text-align: center; font-size: 50px; color: #b02424">Услуги, предлагаемые в приложении Bank.</h2><br> <br>
    <div style="font-size: 40px; color: ghostwhite">
      1. Получение кредита: вы можете оформить кредит на выгодных условиях, <br> не выходя из дома.<br>
      2. Оформление страховок: в приложении можно оформить ОСАГО и <br> КАСКО для вашего автомобиля.<br>
      3. Открытие банковских карт: выбирайте из различных предложений банковских карт и откройте их прямо в приложении.<br>
      4. Инвестирование в ценные бумаги: приложение предоставляет <br> возможность начать инвестировать в акции, облигации и другие финансовые инструменты.<br>
      5. Отзывы о банках: читайте отзывы других пользователей о работе <br> банков или оставляйте свой отзыв.<br>
      6. Курсы валют: узнайте актуальный курс валют на сегодняшний день.<br>
      7, Финансовые новости: следите за последними новостями финансового рынка <br> прямо в приложении.<br>
    </div>
  </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
<script src="JS/button.js"></script>
</body>
</html>