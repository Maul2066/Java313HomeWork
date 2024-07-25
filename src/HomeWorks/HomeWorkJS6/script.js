function Person(name, age, job){
    this.name = name;
    this.age = age;
    this.job = job;
    this.Who = function(){
        return "<div>" + "Я " + "<strong>" + this.name + "</strong>" + " мне " + "<strong>" + this.age + "</strong>" + " лет. Я работаю " + "<strong>" + this.job + "</strong>" + "." + "</div>";
    }
    this.getName = function(){
        return this.name;
    }
    this.getAge = function(){
        return this.age;
    }
    this.getJob = function(){
        return this.job;
    }
}

let Person1 = new Person("Дмитрий", 26, "Дизайнером");
let Person2 = new Person("Станислав", 29, "Программистом");
let Person3 = new Person("Сергей", 35, "Менеджером");
document.write(Person1.Who());
document.write(Person2.Who());
document.write(Person3.Who());
console.log(Person1);