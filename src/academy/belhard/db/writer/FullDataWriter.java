package academy.belhard.db.writer;

import academy.belhard.entity.FullData;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class FullDataWriter {
    private static final String INSERT = "INSERT INTO students (id, first_name, last_name, year_of_birth, school_id) VALUES(?, ?, ?, ?, ?)";

    public static void FullDataWriter(String fileName, List<FullData> fulldata) {

        try (FileWriter writer = new FileWriter(fileName)) {
            for (FullData fullData : fulldata) {
                writer.write(fullData.getFirstName() + "  " +
                        fullData.getId() + "  " +
                        fullData.getDate() + "  " +
                        fullData.getTime() + "  " +
                        fullData.getTailNumber() + "  " +
                        fullData.getBrand() + "  " +
                        fullData.getModel() + "  " +
                        fullData.getPassengerCapacity() + "  " +
                        fullData.getFirstName() + "  " +
                        fullData.getLastName() + "  " +
                        fullData.getCode() + "  " +
                        fullData.getRang() + "  " +
                        "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
