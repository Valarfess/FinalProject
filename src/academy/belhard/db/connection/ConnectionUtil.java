package academy.belhard.db.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

    public static final String URL = "jdbc:mysql://localhost:3306/airports_db?useUnicode=true&serverTimezone=UTC";
    public static final String USER = "root";
    public static final String PASS = "Valar211922fess";

    public static Connection getConnection() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }
}