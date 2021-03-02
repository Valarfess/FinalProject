package academy.belhard;

import academy.belhard.db.reader.FullDataReader;
import academy.belhard.entity.Flights;
import academy.belhard.entity.Pilots;

import academy.belhard.entity.Planes;
import academy.belhard.readers.FlightsDataReader;
import academy.belhard.readers.PilotsDataReader;
import academy.belhard.readers.PlanesDataReader;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        PilotsDataReader pilotsDataReader = new PilotsDataReader("data\\pilots.csv");
        List<Pilots> pilots = PilotsDataReader.read();
        pilots.forEach(System.out::println);

        PlanesDataReader planesDataReader = new PlanesDataReader("data\\planes.csv");
        List<Planes> planes = PlanesDataReader.read();
        planes.forEach(System.out::println);

        FlightsDataReader flightsDataReader = new FlightsDataReader("data\\flights.csv");
        List<Flights> flights = FlightsDataReader.read();
        pilots.forEach(System.out::println);

        FullDataReader.read().forEach(System.out::println);
    }
	// write your code here
    }
}
