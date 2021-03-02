package academy.belhard.db.reader;

import academy.belhard.db.connection.ConnectionUtil;
import academy.belhard.entity.FullData;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FullDataReader {

    private static final String SELECT_FULL_DATA = "SELECT fl.id, fl.date, fl.time, pl.tailNumber, pl.brand, pl.model, pl.passengerCapacity, pi.firstName, pi.lastName, pi.code, pi.rang FROM pilots AS pi LEFT JOIN planes AS pl ON pi.id = pl.plane_id";

    public static List<FullData> read() {
        List<FullData> result = new ArrayList<>();

        Connection connection = ConnectionUtil.getConnection();

        try (PreparedStatement statement = connection.prepareStatement(SELECT_FULL_DATA)) {
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Integer id = resultSet.getInt("id");
                Date date = resultSet.getDate("date");
                Date time = resultSet.getTime("time");
                String tailNumber = resultSet.getString("tailNumber");
                String brand = resultSet.getString("brand");
                String model = resultSet.getString("model");
                Integer passengerCapacity = resultSet.getInt("passengerCapacity");
                String firstName = resultSet.getString("firstname");
                String lastName = resultSet.getString("lastName");
                String code = resultSet.getString("code");
                String rang = resultSet.getString("rang");

                result.add(new FullData(id, date, time, tailNumber, brand, model, passengerCapacity, firstName, lastName, code, rang));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }
}
