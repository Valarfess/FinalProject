package academy.belhard.readers;

import academy.belhard.builders.FlightsBuilder;
import academy.belhard.entity.Flights;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FlightsDataReader implements FileDataReader<Flights> {
    private final String fileName;

    public FlightsDataReader(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public List<Flights> read() {
        List<Flights> flights = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String flightsLine;

            while ((flightsLine = reader.readLine()) != null) {
                Flights flight = FlightsBuilder.builder(flightsLine);

                flights.add(flight);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return flights;
    }
}
