package HomeWorkDSTLUjava3.Tables;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PatientsTable {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/HospitalDatabase";
        String user = "root";
        String password = "Qw2332jha890";

        try {
            Connection connect = DriverManager.getConnection(url, user, password);
            Statement statement = connect.createStatement();
            statement.executeUpdate("CREATE TABLE PatientsREG (id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(255), surname VARCHAR(255), age INT)");
            statement.executeUpdate("INSERT INTO PatientsREG VALUES (1, 'Антон', 'Скоробогадько', 45)");
            statement.executeUpdate("INSERT INTO PatientsREG VALUES (2, 'Мария',  'Шаронина', 23)");
            statement.executeUpdate("INSERT INTO PatientsREG VALUES (3, 'Виктор', 'Смирнов', 50 )");

            statement.close();
            connect.close();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
}
