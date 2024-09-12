<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>Title</title>
  <link rel="stylesheet" href="style.css">
</head>
<body>
<div class="container">
<div class="container1">
<section>
  <p>Название производителя: <%= request.getParameter("PCname")%></p>
  <p>Объем SSD: <%= request.getParameter("SSD")%> ГБ</p>
  <p>Тип видеокарты: <%= request.getParameter("TypeVDC")%></p>
  <p>Модель процессора: <%= request.getParameter("TypeMDPS")%></p>
  <p>Операционная система: <%= request.getParameter("POS")%></p>
  <p>Тип матрицы: <%= request.getParameter("TypeM")%></p>
  <p>Разрешение экрана: <%= request.getParameter("ScreenMS")%></p>
  <p>Сенсорный экран: <%= request.getParameter("CHScreenFunction")%></p>
  <p>Подсветка клавиатуры: <%= request.getParameter("CHTypeCFunction")%></p>
  <p></p>
</section>
</div>
</div>
</body>
</html>