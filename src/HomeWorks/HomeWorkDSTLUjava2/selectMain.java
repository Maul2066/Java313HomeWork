package HomeWorkDSTLUjava2;

import java.sql.*;
import java.util.Scanner;

public class selectMain {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/cars_database";
        String user = "root";
        String password = "Qw2332jha890";
        try {
            Connection connect = DriverManager.getConnection(url, user, password);
            while (true){
                System.out.println("1.Отображение всей базы данных.");
                System.out.println("2.Показать всех производителей автомобилей.");
                System.out.println("3.Показать все автомобили конкретного года выпуска.");
                System.out.println("4.Показать все автомобили конкретного производителя.");
                System.out.println("5.Фильтр для отображения автомобилей по цвету.");
                System.out.println("6.Фильтр по объему двигателя.");
                System.out.println("7.Фильтр по типу автомобиля.");
                System.out.println("0.Выход");
                System.out.print("Выберите функцию: ");
                Scanner scanner = new Scanner(System.in);
                int chooseFunction = scanner.nextInt();
                String sql = "Select * FROM cars";
                Statement statement = connect.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);


                switch (chooseFunction) {
                    case 0:
                        scanner.close();
                        return;
                    case 1:
                        if (chooseFunction == 1) {
                            System.out.println("+---------+------------------------+-------------------------------+---------------------------+---------------+----------------------+");
                            System.out.println("|    ID   |      Manufacturer      |              Name             |        EngineCapacity     |     Year      |         Type         |");
                            System.out.println("+---------+------------------------+-------------------------------+---------------------------+---------------+----------------------+");
                            while (resultSet.next()) {
                                int id = resultSet.getInt("id");
                                String Manufacturer = resultSet.getString("Manufacturer");
                                String name = resultSet.getString("name");
                                double EngineCapacity = resultSet.getDouble("EngineCapacity");
                                int Year = resultSet.getInt("Year");
                                String Type = resultSet.getString("Type");
                                System.out.printf("| %-7d | %-22s |  %-28s | %-25.1f | %-13d |  %-19s |%n", id, Manufacturer, name, EngineCapacity, Year, Type);

                            }
                            System.out.print("+---------+------------------------+-------------------------------+---------------------------+---------------+----------------------+");
                            System.out.println();
                        }
                    case 2:
                        if (chooseFunction == 2) {
                            System.out.println("+---------+------------------------+");
                            System.out.println("|    ID   |      Manufacturer      |");
                            System.out.println("+---------+------------------------+");
                            while (resultSet.next()) {
                                int id = resultSet.getInt("id");
                                String Manufacturer = resultSet.getString("Manufacturer");
                                String name = resultSet.getString("name");
                                double EngineCapacity = resultSet.getDouble("EngineCapacity");
                                int Year = resultSet.getInt("Year");
                                String Type = resultSet.getString("Type");
                                System.out.printf("| %-7d | %-22s |%n", id, Manufacturer, name, EngineCapacity, Year, Type);

                            }
                            System.out.print("+---------+------------------------+");
                            System.out.println();
                        }
                            case 3:
                                if (chooseFunction == 3){
                                System.out.println("Введите год: ");
                                int year = scanner.nextInt();
                                sql = String.format("SELECT * FROM cars WHERE Year = %d", year);
                                resultSet = statement.executeQuery(sql);
                                System.out.println("+---------+------------------------+-------------------------------+---------------------------+---------------+----------------------+");
                                System.out.println("|    ID   |      Manufacturer      |              Name             |        EngineCapacity     |     Year      |         Type         |");
                                System.out.println("+---------+------------------------+-------------------------------+---------------------------+---------------+----------------------+");
                                while (resultSet.next()) {
                                    int id = resultSet.getInt("id");
                                    String Manufacturer = resultSet.getString("Manufacturer");
                                    String name = resultSet.getString("name");
                                    double EngineCapacity = resultSet.getDouble("EngineCapacity");
                                    int Year = resultSet.getInt("Year");
                                    String Type = resultSet.getString("Type");
                                    System.out.printf("| %-7d | %-22s |  %-28s | %-25.1f | %-13d |  %-19s |%n", id, Manufacturer, name, EngineCapacity, Year, Type);

                                }
                                System.out.print("+---------+------------------------+-------------------------------+---------------------------+---------------+----------------------+");
                                System.out.println();}
                    case 4:
                        if (chooseFunction == 4){
                        System.out.println("Введите производителя: ");
                        String manufacturer = scanner.next();
                        sql = String.format("SELECT * FROM cars WHERE Manufacturer = '%s'", manufacturer);
                        resultSet = statement.executeQuery(sql);
                        System.out.println("+---------+------------------------+-------------------------------+---------------------------+---------------+----------------------+");
                        System.out.println("|    ID   |      Manufacturer      |              Name             |        EngineCapacity     |     Year      |         Type         |");
                        System.out.println("+---------+------------------------+-------------------------------+---------------------------+---------------+----------------------+");
                        while (resultSet.next()) {
                            int id = resultSet.getInt("id");
                            String Manufacturer = resultSet.getString("Manufacturer");
                            String name = resultSet.getString("name");
                            double EngineCapacity = resultSet.getDouble("EngineCapacity");
                            int Year = resultSet.getInt("Year");
                            String Type = resultSet.getString("Type");
                            System.out.printf("| %-7d | %-22s |  %-28s | %-25.1f | %-13d |  %-19s |%n", id, Manufacturer, name, EngineCapacity, Year, Type);

                        }
                        System.out.print("+---------+------------------------+-------------------------------+---------------------------+---------------+----------------------+");
                        System.out.println();}
                    case 5:
                        if (chooseFunction == 5){
                        System.out.println("Введите цвет: ");
                        String color = scanner.next();
                        sql = String.format("SELECT * FROM cars WHERE Color = '%s'", color);
                        resultSet = statement.executeQuery(sql);
                        System.out.println("+---------+------------------------+-------------------------------+---------------------------+---------------+----------------------+");
                        System.out.println("|    ID   |      Manufacturer      |              Name             |        EngineCapacity     |     Year      |         Type         |");
                        System.out.println("+---------+------------------------+-------------------------------+---------------------------+---------------+----------------------+");
                        while (resultSet.next()) {
                            int id = resultSet.getInt("id");
                            String Manufacturer = resultSet.getString("Manufacturer");
                            String name = resultSet.getString("name");
                            double EngineCapacity = resultSet.getDouble("EngineCapacity");
                            int Year = resultSet.getInt("Year");
                            String Type = resultSet.getString("Type");
                            System.out.printf("| %-7d | %-22s |  %-28s | %-25.1f | %-13d |  %-19s |%n", id, Manufacturer, name, EngineCapacity, Year, Type);

                        }
                        System.out.print("+---------+------------------------+-------------------------------+---------------------------+---------------+----------------------+");
                        System.out.println();}
                    case 6:
                        if (chooseFunction == 6){
                        System.out.println("Введите объем двигателя: ");
                        while (!scanner.hasNextDouble()) {
                            System.out.println("Некорректный ввод. Пожалуйста, введите число.");
                            scanner.next();
                        }
                        String engineCapacity = scanner.next();
                        sql = String.format("SELECT * FROM cars WHERE EngineCapacity = %s", engineCapacity);
                        resultSet = statement.executeQuery(sql);
                        System.out.println("+---------+------------------------+-------------------------------+---------------------------+---------------+----------------------+");
                        System.out.println("|    ID   |      Manufacturer      |              Name             |        EngineCapacity     |     Year      |         Type         |");
                        System.out.println("+---------+------------------------+-------------------------------+---------------------------+---------------+----------------------+");
                        while (resultSet.next()) {
                            int id = resultSet.getInt("id");
                            String Manufacturer = resultSet.getString("Manufacturer");
                            String name = resultSet.getString("name");
                            double EngineCapacity = resultSet.getDouble("EngineCapacity");
                            int Year = resultSet.getInt("Year");
                            String Type = resultSet.getString("Type");
                            System.out.printf("| %-7d | %-22s |  %-28s | %-25.1f | %-13d |  %-19s |%n", id, Manufacturer, name, EngineCapacity, Year, Type);

                        }
                        System.out.print("+---------+------------------------+-------------------------------+---------------------------+---------------+----------------------+");
                        System.out.println();}
                    case 7:
                        if (chooseFunction == 7){
                        System.out.println("Введите тип автомобиля: ");
                        String type = scanner.next();
                        sql = String.format("SELECT * FROM cars WHERE Type = '%s'", type);
                        resultSet = statement.executeQuery(sql);
                        System.out.println("+---------+------------------------+-------------------------------+---------------------------+---------------+----------------------+");
                        System.out.println("|    ID   |      Manufacturer      |              Name             |        EngineCapacity     |     Year      |         Type         |");
                        System.out.println("+---------+------------------------+-------------------------------+---------------------------+---------------+----------------------+");
                        while (resultSet.next()) {
                            int id = resultSet.getInt("id");
                            String Manufacturer = resultSet.getString("Manufacturer");
                            String name = resultSet.getString("name");
                            double EngineCapacity = resultSet.getDouble("EngineCapacity");
                            int Year = resultSet.getInt("Year");
                            String Type = resultSet.getString("Type");
                            System.out.printf("| %-7d | %-22s |  %-28s | %-25.1f | %-13d |  %-19s |%n", id, Manufacturer, name, EngineCapacity, Year, Type);

                        }
                        System.out.print("+---------+------------------------+-------------------------------+---------------------------+---------------+----------------------+");
                        System.out.println();}
                }
            }
        } catch (SQLException exception){
            exception.printStackTrace();
        }

    }
}
