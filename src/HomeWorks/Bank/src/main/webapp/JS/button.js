const menu = document.getElementById('GeneralMenu_ID');
const admin = document.getElementById('AdminMenu_ID');
const worker = document.getElementById('WorkerMenu_ID');
const other = document.getElementById('OtherMenu_ID');

menu.addEventListener('click', function1);
admin.addEventListener('click', function2);
worker.addEventListener('click', function3);
other.addEventListener('click', function4);

function function1(){
    window.location = "../index.jsp";
}

function function2(){
    window.location = "../admin.jsp";
}

function function3(){
    window.location = "../worker.jsp";
}

function function4(){
    window.location = "../other.jsp";
}