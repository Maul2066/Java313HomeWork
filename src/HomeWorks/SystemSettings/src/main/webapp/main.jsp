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
    <form action="user.jsp" method="post">
      <p>Название производителя: <input type="text" name="PCname"></p>
      <p>Объем SSD:
        <select name="SSD">
          <option value="64">64 ГБ</option>
          <option value="120">120 ГБ</option>
          <option value="240">240 ГБ</option>
          <option value="500">500 ГБ</option>
        </select></p>

      <p>Тип видеокарты:
        <select name="TypeVDC">
          <option value="Интегрированная видеокарта">Интегрированная видеокарта</option>
          <option value="Дискретная видеокарта">Дискретная видеокарта</option>
          <option value="Игровая видеокарта">Игровая видеокарта</option>
          <option value="Профессиональная видеокарта">Профессиональная видеокарта</option>
        </select></p>

      <p>Модель процессора:
        <select name="TypeMDPS">
          <option value="Intel Core i3-10100F BOX">Intel Core i3-10100F BOX</option>
          <option value="Intel Core i5-12400F OEM">Intel Core i5-12400F OEM</option>
          <option value="Intel Core i3-12100F OEM">Intel Core i3-12100F OEM</option>
          <option value="Intel Core i5-10400F">Intel Core i5-10400F</option>
          <option value="AMD RYZEN 5 5600X">AMD RYZEN 5 5600X</option>
          <option value="AMD FX 8300">AMD FX 8300</option>
          <option value="Intel Core i9-11900K">Intel Core i9-11900K</option>
          <option value="AMD Ryzen 7 2700">AMD Ryzen 7 2700</option>
        </select></p>

      <p>Операционная система:
        <select name="POS">
          <option value="Windows 10">Windows 10</option>
          <option value="Windows 11">Windows 11</option>
        </select></p>

      <p>Тип матрицы: <input type="text" name="TypeM"></p>

      <p>Разрешение экрана:
        <select name="ScreenMS">
          <option value="1366 х 768">1366 х 768</option>
          <option value="1920 х 1080">1920 х 1080</option>
          <option value="3840 х 2160">3840 х 2160</option>
        </select></p>

      <p>Сенсорный экран: <br>
        <label for="yesScreen">
          <input type="radio" id="yesScreen" value="Да" name="CHScreenFunction"> Да
        </label>

        <label for="noScreen">
          <input type="radio" id="noScreen" value="Нет" name="CHScreenFunction"> Нет
        </label>
      </p>

      <p>Подсветка клавиатуры: <br>
        <label for="CTypeY">
          <input type="radio" id="CTypeY" value="Да" name="CHTypeCFunction"> Да
        </label>

        <label for="CTypeN">
          <input type="radio" id="CTypeN" value="Нет" name="CHTypeCFunction"> Нет
        </label>
      </p>

      <p><input type="submit" value="Подтвердить"></p>
    </form>
  </section>
  </div>
</div>
</body>
</html>