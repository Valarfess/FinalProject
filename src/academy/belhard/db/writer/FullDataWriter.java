package academy.belhard.db.writer;

import academy.belhard.entity.FullData;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class FullDataWriter {

    public static void FullDataWriter(String fileName, List<FullData> result) {

        try (FileWriter writer = new FileWriter(fileName)) {
            for (FullData resultFullData : result) {
                writer.write(resultFullData.getNumber() + ";" +
                        resultFullData.getDate() + ";" +
                        resultFullData.getTime() + ";" +
                        resultFullData.getTailNumber() + ";" +
                        resultFullData.getBrandModel() + ";" +
                        resultFullData.getPassengerCapacity() + ";" +
                        resultFullData.getFirstNameLast() + ";" +
                        resultFullData.getCodeRang() + ";" +
                        "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
