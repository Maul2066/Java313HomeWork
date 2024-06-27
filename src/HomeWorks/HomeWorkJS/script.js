let input = prompt("Введите пятизначное число число:");
let num = input;
let num1, num2, num3, num4, num5, result, resultAvr;

num1 = (parseInt (num % 10));
num = (parseInt (num / 10));
num2 = (parseInt (num % 10));
num = (parseInt (num / 10));
num3 = (parseInt(num % 10));
num = (parseInt(num / 10));
num4 = (parseInt (num % 10));
num = (parseInt (num / 10));
num5 = (parseInt (num % 10));
result = num5 * num4 * num3 * num2 * num1;
resultAvr = ((num5 + num4 + num3 + num2 + num1) / 5);
alert(`Произведение цифр: ${result}`);
alert(`Среднее арифметическое: ${resultAvr}`);