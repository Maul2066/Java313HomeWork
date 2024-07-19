let array = [0, 1, 2];
document.write("<div class='General'>");
document.write("<table> <tr><td>" + "<img src='" + array[0] + ".jpg' class='img_class' alt='' id='image01'>" + "</td>");
document.write("<td>" + "<img src='" + array[1] + ".jpg' class='img_class' alt='' id='image02'>" + "</td>");
document.write("<td>" + "<img src='" + array[2] + ".jpg' class='img_class' alt='' id='image03'>" + "</td>");
document.write("</tr></table>");
document.write("<div class='Reverse'><strong>поменять </strong>");
document.write("<input type='text' id='Number1' class='input_class'>");
document.write("<strong> на </strong>");
document.write("<input type='text' id='Number2' class='input_class'>");
document.write("</div>");
document.write("<br>");
document.write("<br>");
document.write("<br>");
document.write("<button onclick='Swap()' class='button_class'> Поменять </button>");
function Swap() {
    const Number1 = Number(document.getElementById('Number1').value);
    const Number2 = Number(document.getElementById('Number2').value);
    if (Number1 < 1 || Number1 > 3 || Number2 < 1 || Number2 > 3) {
        alert('Введите номера от 1 до 3');
        return;
    }
    const image01 = document.getElementById('image0' + Number1);
    const image02 = document.getElementById('image0' + Number2);
    const SwapIMG = image01.src;
    image01.src = image02.src;
    image02.src = SwapIMG;
}
document.write("<br>");
document.write("<br>");
document.write("<br>");
document.write("<br>");
document.write("<br>");
document.write("</div>");