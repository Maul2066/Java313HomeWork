package HomeWorkDSTLUjava3.Tables;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PersonTable {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/HospitalDatabase";
        String user = "root";
        String password = "Qw2332jha890";

        try {
            Connection connect = DriverManager.getConnection(url, user, password);
            Statement statement = connect.createStatement();
            statement.executeUpdate("CREATE TABLE Patients (id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(255), surname VARCHAR(255), age INT, specialistName VARCHAR(255), SpecialistSurname VARCHAR(255), SpecialistProfType VARCHAR(255), day INT, month VARCHAR(255), time VARCHAR(255))");
            statement.executeUpdate("INSERT INTO Patients VALUES (1, 'Антон', 'Скоробогадько', 45, 'Владислав', 'Викторович', 'Терапевт', 3, 'Сентябрь', '06:35')");
            statement.executeUpdate("INSERT INTO Patients VALUES (2, 'Мария',  'Шаронина', 23, 'Сергей', 'Львович', 'Хирург', 31, 'Октябрь', '16:30')");
            statement.executeUpdate("INSERT INTO Patients VALUES (3, 'Виктор', 'Смирнов', 50, 'Виктор', 'Владимирович', 'Окулист', 16, 'Ноябрь', '16:50')");

            statement.close();
            connect.close();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
}
