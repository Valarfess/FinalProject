package academy.belhard.db.writer;

import academy.belhard.entity.FullData;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class FullDataWriter {

    private static final String DELIMETR = ";";

    public static void FullDataWriter(String fileName, List<FullData> result) {

        try (FileWriter writer = new FileWriter(fileName)) {
            for (FullData resultFullData : result) {
                writer.write(resultFullData.getNumber() + DELIMETR +
                        resultFullData.getDate() + DELIMETR +
                        resultFullData.getTime() + DELIMETR +
                        resultFullData.getTailNumber() + DELIMETR +
                        resultFullData.getBrandModel() + DELIMETR +
                        resultFullData.getPassengerCapacity() + DELIMETR +
                        resultFullData.getFirstNameLast() + DELIMETR +
                        resultFullData.getCodeRang() + DELIMETR +
                        "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
