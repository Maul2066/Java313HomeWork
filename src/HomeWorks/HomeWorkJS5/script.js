let choose = document.querySelector("input[type='button']");
choose.addEventListener("click", AnswerGiving)
function AnswerGiving(){
    if(document.form.question.value == 0){
        alert("Вариант не был выбран");
    } else {
        alert(document.form.question.value);
    }
}