package HomeWorkDSTLUjava3.Assets;

import java.sql.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class hospitalMain {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/HospitalDatabase";
        String user = "root";
        String password = "Qw2332jha890";
        try {
            Connection connect = DriverManager.getConnection(url, user, password);
            int chooseFunction;
            while (true) {
                System.out.println("1.Добавить пациента.");
                System.out.println("2.Просмотр пациентов.");
                System.out.println("3.Посмотреть врачей.");
                System.out.println("4.Записаться на приём.");
                System.out.println("5.Выход");
                System.out.print("Выберите функцию: ");
                Scanner scanner = new Scanner(System.in);
                chooseFunction = scanner.nextInt();
                String sql;
                Statement statement;
                ResultSet resultSet;
                if (chooseFunction == 1){
                    System.out.println();
                    System.out.print("Введите имя пациента: ");
                    String name  = scanner.next();
                    System.out.print("Введите фамилию пациента: ");
                    String surname = scanner.next();
                    System.out.print("Введите возраст пациента: ");
                    int age = scanner.nextInt();
                    statement = connect.createStatement();
                    statement.executeUpdate("INSERT INTO PatientsREG (name, surname, age) VALUES ('" + name + "', '" + surname + "', " + age + ")");
                    System.out.println();

                    sql = "SELECT * FROM hospitaldatabase.patientsREG";
                    statement = connect.createStatement();
                    resultSet = statement.executeQuery(sql);

                    System.out.println("Все пациенты: ");
                    System.out.println("+------------------------+------------------------+-------------------------------+---------------------------+");
                    System.out.println("| Идентификатор пациента |       Имя пациента     |         Фамилия пациента      |          Возраст          |");
                    System.out.println("+------------------------+------------------------+-------------------------------+---------------------------+");
                    while (resultSet.next()){
                        int id1 = resultSet.getInt("id");
                        String name1 = resultSet.getString("name");
                        String surname1 = resultSet.getString("surname");
                        int age1 = resultSet.getInt("age");
                        System.out.printf("| %-22d | %-22s |  %-28s |  %-23d  |%n", id1, name1, surname1, age1);
                        System.out.println("+------------------------+------------------------+-------------------------------+---------------------------+");
                    }


                } else if (chooseFunction == 2) {
                    sql = "SELECT * FROM hospitaldatabase.patients;";
                    statement = connect.createStatement();
                    resultSet = statement.executeQuery(sql);

                    System.out.println("Пациенты:");
                    System.out.println("+------------------------+------------------------+-------------------------------+---------------------------+--------------------------------+--------------------------------------+-----------------------+-------------------+----------------+----------------+");
                    System.out.println("| Идентификатор пациента |       Имя пациента     |         Фамилия пациента      |          Возраст          |      Имя назначенного врача    |       Фамилия назначенного врача     |      Специализация    |    День приема    |  Месяц приема  |   Время приема |");
                    System.out.println("+------------------------+------------------------+-------------------------------+---------------------------+--------------------------------+--------------------------------------+-----------------------+-------------------+----------------+----------------+");
                    while (resultSet.next()) {
                        int id = resultSet.getInt("id");
                        String name = resultSet.getString("name");
                        String surname = resultSet.getString("surname");
                        int age = resultSet.getInt("age");
                        String specialistName = resultSet.getString("specialistName");
                        String SpecialistSurname = resultSet.getString("SpecialistSurname");
                        String SpecialistProfType = resultSet.getString("SpecialistProfType");
                        int day = resultSet.getInt("day");
                        String month = resultSet.getString("month");
                        String time = resultSet.getString("time");
                        System.out.printf("| %-22d | %-22s |  %-28s |  %-23d  |  %-29s |   %-33s  |  %-19s  |  %-15d  |  %-13s |  %-13s |%n", id, name, surname, age, specialistName, SpecialistSurname, SpecialistProfType, day, month, time);
                        System.out.println("+------------------------+------------------------+-------------------------------+---------------------------+--------------------------------+--------------------------------------+-----------------------+-------------------+----------------+----------------+");
                    }

                } else if (chooseFunction == 3) {
                    System.out.println();
                    sql = "SELECT * FROM hospitaldatabase.doctors;";
                    statement = connect.createStatement();
                    resultSet = statement.executeQuery(sql);

                    System.out.println("Врачи:");
                    System.out.println("+------------------------+------------------------+-------------------------------+---------------------------+");
                    System.out.println("|  Идентификатор врача   |           Имя          |           Фамилия             |        Специализация      |");
                    System.out.println("+------------------------+------------------------+-------------------------------+---------------------------+");
                    while (resultSet.next()) {
                        int id = resultSet.getInt("id");
                        String name = resultSet.getString("name");
                        String surname = resultSet.getString("surname");
                        String SpecialistProfType = resultSet.getString("SpecialistProfType");
                        System.out.printf("| %-22d | %-22s |  %-28s | %-25s |%n", id, name, surname, SpecialistProfType);
                        System.out.println("+------------------------+------------------------+-------------------------------+---------------------------+");
                    }
                } else if (chooseFunction == 4) {
                    System.out.println();
                    System.out.print("Введите ваше имя: ");
                    String name  = scanner.next();
                    System.out.print("Введите вашу фамилию: ");
                    String surname = scanner.next();
                    System.out.print("Введите ваш возраст: ");
                    int age = scanner.nextInt();
                    System.out.print("Введите имя врача к которому хотите записаться: ");
                    String specialistName = scanner.next();
                    System.out.print("Введите фамилию врача к которому хотите записаться: ");
                    String SpecialistSurname = scanner.next();
                    System.out.print("Введите специальность врача к которому хотите попасть: ");
                    String SpecialistProfType = scanner.next();
                    System.out.print("Введите месяц на который хотите записаться: ");
                    String month = scanner.next();
                    System.out.print("Введите число на которое вы хотите записаться: ");
                    int day = scanner.nextInt();
                    System.out.print("Введите время на которое хотите записаться: ");
                    String time = scanner.next();

                    statement = connect.createStatement();
                    statement.executeUpdate("INSERT INTO Patients (name, surname, age, specialistName, SpecialistSurname, SpecialistProfType, day, month, time) VALUES ('" + name + "', '" + surname + "', " + age + ", '" + specialistName + "', '" + SpecialistSurname + "', '" + SpecialistProfType + "', " + day + ", '" + month + "', '" + time + "')");

                    System.out.println();

                    sql = "SELECT * FROM hospitaldatabase.Patients";
                    statement = connect.createStatement();
                    ResultSet resultSet1 = statement.executeQuery(sql);
                    System.out.println("+------------------------+------------------------+-------------------------------+---------------------------+--------------------------------+--------------------------------------+-----------------------+-------------------+----------------+----------------+");
                    System.out.println("| Идентификатор пациента |       Имя пациента     |         Фамилия пациента      |          Возраст          |      Имя назначенного врача    |       Фамилия назначенного врача     |      Специализация    |    День приема    |  Месяц приема  |   Время приема |");
                    System.out.println("+------------------------+------------------------+-------------------------------+---------------------------+--------------------------------+--------------------------------------+-----------------------+-------------------+----------------+----------------+");
                    while (resultSet1.next()){
                        int id1 = resultSet1.getInt("id");
                        String name1 = resultSet1.getString("name");
                        String surname1 = resultSet1.getString("surname");
                        int age1 = resultSet1.getInt("age");
                        String specialistName1 = resultSet1.getString("specialistName");
                        String SpecialistSurname1 = resultSet1.getString("SpecialistSurname");
                        String SpecialistProfType1 = resultSet1.getString("SpecialistProfType");
                        int day1 = resultSet1.getInt("day");
                        String month1 = resultSet1.getString("month");
                        String time1 = resultSet1.getString("time");
                        System.out.printf("| %-22d | %-22s |  %-28s |  %-23d  |  %-29s |   %-33s  |  %-19s  |  %-15d  |  %-13s |  %-13s |%n", id1, name1, surname1, age1, specialistName1, SpecialistSurname1, SpecialistProfType1, day1, month1, time1);
                        System.out.println("+------------------------+------------------------+-------------------------------+---------------------------+--------------------------------+--------------------------------------+-----------------------+-------------------+----------------+----------------+");
                    }
                    } else if (chooseFunction == 5) {
                    scanner.close();
                    break;
                } else {
                    System.out.println();
                    System.out.println("+-------------------------------------------------------------------------------------------------------------------------------------+");
                    System.out.println("|                Вы ввели неверное число. Убедитесь в том, что выбранное вами число есть в списке доступных функций.                  |");
                    System.out.println("+-------------------------------------------------------------------------------------------------------------------------------------+");
                    System.out.println();
                }
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
}
