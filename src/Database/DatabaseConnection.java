package Database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static Connection getConnection() throws SQLException, ClassNotFoundException {

        String DB = "jdbc:mysql://localhost:3306/shootergame";
        String USER = "root";
        String PASS = "1234";

        Class.forName("com.mysql.cj.jdbc.Driver");

        return DriverManager.getConnection(DB,USER,PASS);

    }
}
