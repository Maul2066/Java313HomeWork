document.write("<div id='General'> <div>");
class General{
    constructor(img, div){
        this.src = img;
        this.div = div;
    }
    read(id){
        let getInfo = `<img src="${this.src}"> <div>${this.div}</div>`;
        document.querySelector(`#${id}`).innerHTML = getInfo;
    }
}

let img = "images/libra.gif";
let img1 = "images/cancer.gif";
let img2 = "images/aquarius.gif";
let img3 = "images/gemini.gif";
let img4 = "images/pisces.gif";
let img5 = "images/taurus.gif";
let img6 = "images/leo.gif";
let img7 = "images/sagittarius.gif";
let img8 = "images/capricorn.gif";
let array = new General(img, "Работа 24 часа в сутки, 7 дней в неделю, 365 дней в году");
let array1 = new General(img1, "Нет географических границ");
let array2 = new General(img2, "Ассортимент");
let array3 = new General(img3, "Безопасность");
let array4 = new General(img4, "Сокращение расходов на аренду и персонал");
let array5 = new General(img5, "Партнерские отношения");
let array6 = new General(img6, "Покупатель всегда на связи");
let array7 = new General(img7, "Комфортный выбор");
let array8 = new General(img8, "Удобство оплаты");
array.read("array");
array1.read("array1");
array2.read("array2");
array3.read("array3");
array4.read("array4");
array5.read("array5");
array6.read("array6");
array7.read("array7");
array8.read("array8");