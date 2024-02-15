package HomeWorks.HomeWork24;

public class Student {
    //Р класс
    public String name;
    public String surname;
    public String group;
    public int grade;
    public double sum;

    public Student(String NAME, String SURNAME, String GROUP, int GRADE) {
        this.name = NAME;
        this.surname = SURNAME;
        this.group = GROUP;
        this.grade = GRADE;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getGroup() {
        return group;
    }

    public int getGrade() {
        return grade;
    }

    public double getSum() {
        return sum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    void Student_information(){
        if (getGrade() == 5){
            sum = 1000;
        } else {
            sum = 800;
        }
        System.out.println(getName() + " " + getSurname() + ", группа " + getGroup() + ", сумма стипендии: " + getSum());
    }
}
