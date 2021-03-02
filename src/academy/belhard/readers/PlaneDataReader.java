package academy.belhard.readers;

import academy.belhard.builders.PlanesBuilder;
import academy.belhard.entity.Plane;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PlaneDataReader implements FileDataReader<Plane> {
    private final String fileName;

    public PlaneDataReader(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public List<Plane> read() {
        List<Plane> planes = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String planesLine;

            while ((planesLine = reader.readLine()) != null) {
                Plane plane = PlanesBuilder.builder(planesLine);

                planes.add(plane);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return planes;
    }
}