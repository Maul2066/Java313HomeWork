package HomeWorks.HomeWork24;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Виктор", "Вербов", "Gr111", 5);
        Aspirant aspirant = new Aspirant("Александр", "Невзоров", "Gr222", "'Work1'", 3);
        Aspirant aspirant1 = new Aspirant("Антон", "Бобров", "Gr333", "'Work2'", 5);
        student.Student_information();
        aspirant.Student_information();
        aspirant1.Student_information();
    }
}
