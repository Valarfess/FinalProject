package academy.belhard;

import academy.belhard.db.reader.FullDataReader;
import academy.belhard.db.writer.FullDataWriter;
import academy.belhard.db.writer.SQLDataWriter;
import academy.belhard.entity.Flight;
import academy.belhard.entity.FullData;
import academy.belhard.entity.Pilot;
import academy.belhard.entity.Plane;
import academy.belhard.readers.FlightDataReader;
import academy.belhard.readers.PilotDataReader;
import academy.belhard.readers.PlaneDataReader;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        PilotDataReader pilotDataReader = new PilotDataReader("C:\\Users\\Fess\\IdeaProjects\\FinalProject\\src\\academy\\belhard\\db\\data\\pilots.csv");
        List<Pilot> pilots = pilotDataReader.read();
        pilots.forEach(System.out::println);

        PlaneDataReader planeDataReader = new PlaneDataReader("C:\\Users\\Fess\\IdeaProjects\\FinalProject\\src\\academy\\belhard\\db\\data\\planes.csv");
        List<Plane> planes = planeDataReader.read();
        planes.forEach(System.out::println);

        FlightDataReader flightDataReader = new FlightDataReader("C:\\Users\\Fess\\IdeaProjects\\FinalProject\\src\\academy\\belhard\\db\\data\\flights.csv");
        List<Flight> flights = flightDataReader.read();
        flights.forEach(System.out::println);
        System.out.println();

        SQLDataWriter.addToPilots(pilots);
        SQLDataWriter.addToPlanes(planes);
        SQLDataWriter.addToFlights(flights);

        FullDataReader.read().forEach(System.out::println);
        System.out.println();

        List<FullData> result = FullDataReader.read();
        FullDataWriter.FullDataWriter("result\\FullDataAirport.csv", result);

        FullDataReader.read().forEach(System.out::println);
    }

}

