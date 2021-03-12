package academy.belhard.db.reader;

import academy.belhard.db.connection.ConnectionUtil;
import academy.belhard.entity.FullData;
import academy.belhard.entity.PilotRang;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static academy.belhard.constants.Constants.*;

public class FullDataReader {



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
                String brandModel = resultSet.getString(BRANDMODEL);
                Integer passengerCapacity = resultSet.getInt("passengerCapacity");
                String firstNameLast = resultSet.getString(FIRSTNAMELAST);
                String codeRang = resultSet.getString(CODERANG);

                result.add(new FullData(number, date, time, tailNumber, brandModel, passengerCapacity, firstNameLast, codeRang));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }
}
