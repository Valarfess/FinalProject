package academy.belhard.readers;

import academy.belhard.builders.PlanesBuilder;
import academy.belhard.entity.Planes;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PlanesDataReader implements FileDataReader<Planes> {
    private final String fileName;

    public PlanesDataReader(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public List<Planes> read() {
        List<Planes> planes = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String planesLine;

            while ((planesLine = reader.readLine()) != null) {
                Planes plane = PlanesBuilder.builder(planesLine);

                planes.add(plane);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return planes;
    }
}