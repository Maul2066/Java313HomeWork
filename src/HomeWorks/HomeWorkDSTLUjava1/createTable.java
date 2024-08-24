package HomeWorkDSTLUjava1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class createTable {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/cars_database";
        String user = "root";
        String password = "Qw2332jha890";

        try {
            Connection connect = DriverManager.getConnection(url, user, password);
            Statement statement = connect.createStatement();

            statement.executeUpdate("CREATE TABLE Cars (id INT PRIMARY KEY AUTO_INCREMENT, Manufacturer VARCHAR(255), name VARCHAR(255), EngineCapacity DOUBLE, Year INT, Color VARCHAR(255), Type VARCHAR(255))");
            statement.executeUpdate("INSERT INTO Cars VALUES (1, 'Koenigsegg', 'Koenigsegg Gemera', 2.0, 2021, 'black', 'Hypercar')");
            statement.executeUpdate("INSERT INTO Cars VALUES (2, 'Bugatti', 'Bugatti Bolide', 8.0, 2021, 'blue', 'Hypercar')");
            statement.executeUpdate("INSERT INTO Cars VALUES (3, 'Chevrolet', 'Chevrolet Camaro 2SS', 6.2, 2009, 'white', 'Coupe')");

            statement.close();
            connect.close();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
}
