package academy.belhard.readers;


import academy.belhard.builders.PilotsBuilder;
import academy.belhard.entity.Pilots;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PilotsDataReader implements FileDataReader<Pilots> {

    private final String fileName;

    public PilotsDataReader(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public List<Pilots> read() {
        List<Pilots> pilots = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String pilotsLine = null;

            while ((pilotsLine = reader.readLine()) != null) {
                Pilots pilot = PilotsBuilder.builder(pilotsLine);

                pilots.add(pilot);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return pilots;
    }
}