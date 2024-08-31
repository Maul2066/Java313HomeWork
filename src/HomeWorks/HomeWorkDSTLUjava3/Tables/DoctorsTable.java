package HomeWorkDSTLUjava3.Tables;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DoctorsTable {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/HospitalDatabase";
        String user = "root";
        String password = "Qw2332jha890";

        try {
            Connection connect = DriverManager.getConnection(url, user, password);
            Statement statement = connect.createStatement();
            statement.executeUpdate("CREATE TABLE Doctors (id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(255), surname VARCHAR(255), SpecialistProfType VARCHAR(255))");
            statement.executeUpdate("INSERT INTO Doctors VALUES (1, 'Владислав', 'Викторович', 'Терапевт')");
            statement.executeUpdate("INSERT INTO Doctors VALUES (2, 'Виктор', 'Владимирович', 'Окулист')");
            statement.executeUpdate("INSERT INTO Doctors VALUES (3, 'Сергей', 'Львович', 'Хирург')");

            statement.close();
            connect.close();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
}
