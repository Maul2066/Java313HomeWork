document.write("<div style='font-weight: bold; text-align: center;'>");
let array = ["Январь", "Февраль", "Март","Апрель","Май","Июнь","Июль", "Август", "Сентябрь","Октябрь","Ноябрь","Декабрь"];
let ColorRandom = () => Math.floor(Math.random() * 256);

for(let i = 0; i < 12; i++){
    document.write("<div id='color' style='background-color: "+ "rgb(" + ColorRandom() + ", " + ColorRandom() + ", " + ColorRandom() + ")" + ";'>" + array[i] + "</div>");
}
document.write("</div>");