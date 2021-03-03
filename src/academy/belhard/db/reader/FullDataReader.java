package academy.belhard.db.reader;

import academy.belhard.db.connection.ConnectionUtil;
import academy.belhard.entity.FullData;
import academy.belhard.entity.PilotRang;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FullDataReader {

    private static final String SELECT_FULL_DATA = "SELECT fl.number, fl.date, fl.time, pl.tailNumber, CONCAT_WS (' ',pl.brand, pl.model), pl.passengerCapacity, "+
    "CONCAT(CONCAT_WS(' ',pi.firstName, SUBSTR(pi.lastName, 1, 1)),'.'), CONCAT_WS (' ', pi.code, (CONCAT ('(',pi.rang,')'))) " +
    "FROM flights AS fl "+
    "JOIN planes AS pl ON fl.plane_id = pl.id " +
    "JOIN pilots AS pi ON fl.pilot_id = pi.id";

    public static List<FullData> read() {
        List<FullData> result = new ArrayList<>();

        Connection connection = ConnectionUtil.getConnection();

        try (PreparedStatement statement = connection.prepareStatement(SELECT_FULL_DATA)) {
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String number = resultSet.getString("number");
                Date date = resultSet.getDate("date");
                Time time = resultSet.getTime("time");
                String tailNumber = resultSet.getString("tailNumber");
                String brandModel = resultSet.getString("CONCAT_WS (' ',pl.brand, pl.model)");
                Integer passengerCapacity = resultSet.getInt("passengerCapacity");
                String firstNameLast = resultSet.getString("CONCAT(CONCAT_WS(' ',pi.firstName, SUBSTR(pi.lastName, 1, 1)),'.')");
                String codeRang = resultSet.getString("CONCAT_WS (' ', pi.code, (CONCAT ('(',pi.rang,')')))");

                result.add(new FullData(number, date, time, tailNumber, brandModel, passengerCapacity, firstNameLast, codeRang));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }
}
