package academy.belhard;

import academy.belhard.db.reader.FullDataReader;
import academy.belhard.entity.Flight;
import academy.belhard.entity.Pilot;
import academy.belhard.entity.Plane;
import academy.belhard.readers.FlightDataReader;
import academy.belhard.readers.PilotDataReader;
import academy.belhard.readers.PlaneDataReader;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        PilotDataReader pilotDataReader = new PilotDataReader("data\\pilots.csv");
        List<Pilot> pilot = PilotDataReader.read();
        pilot.forEach(System.out::println);

        PlaneDataReader planeDataReader = new PlaneDataReader("data\\planes.csv");
        List<Plane> planes = PlaneDataReader.read();
        planes.forEach(System.out::println);

        FlightDataReader flightDataReader = new FlightDataReader("data\\flights.csv");
        List<Flight> flights = FlightDataReader.read();
        pilot.forEach(System.out::println);

        FullDataReader.read().forEach(System.out::println);
    }

}

