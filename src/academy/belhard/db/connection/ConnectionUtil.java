package academy.belhard.db.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static academy.belhard.constants.Constants.*;

public class ConnectionUtil {

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