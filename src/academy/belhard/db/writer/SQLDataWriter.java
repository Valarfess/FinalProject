package academy.belhard.db.writer;

import academy.belhard.db.connection.ConnectionUtil;
import academy.belhard.entity.Flight;
import academy.belhard.entity.Pilot;
import academy.belhard.entity.Plane;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class SQLDataWriter {
    private static final String ADD_TO_PILOTS = "INSERT INTO pilots (id, firstname, lastname, rang, code) VALUES(?, ?, ?, ?, ?)";
    private static final String ADD_TO_PLANES = "INSERT INTO planes (id, brand, model, passengercapacity, tailnumber) VALUES(?, ?, ?, ?, ?)";
    private static final String ADD_TO_FLIGHTS = "INSERT INTO flights (id, plane_id, pilot_id, date, time, number) VALUES(?, ?, ?, ?, ?, ?)";

    public static void addToPilots(List<Pilot> pilots) {
        Connection connection = ConnectionUtil.getConnection();
        System.out.println("Начало записи в таблицу 'Pilots'");
        for (Pilot pilot : pilots)
        try (
                PreparedStatement statement = connection.prepareStatement(ADD_TO_PILOTS)
        ) {
            statement.setInt(1, pilot.getId());
            statement.setString(2, pilot.getFirstName());
            statement.setString(3, pilot.getLastName());
            statement.setString(4, String.valueOf(pilot.getRang()));
            statement.setString(5, pilot.getCode());

            statement.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Запись в таблицу 'Pilots' закончена");
    }
    public static void addToPlanes(List<Plane> planes) {
        Connection connection = ConnectionUtil.getConnection();
        System.out.println("Начало записи в таблицу 'Planes'");
        for (Plane plane : planes)
        try (
                PreparedStatement statement = connection.prepareStatement(ADD_TO_PLANES)
        ) {
            statement.setInt(1, plane.getId());
            statement.setString(2, plane.getBrand());
            statement.setString(3, plane.getModel());
            statement.setInt(4, plane.getPassengerCapacity());
            statement.setString(5, plane.getTailNumber());

            statement.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Запись в таблицу 'Planes' закончена");
    }
    public static void addToFlights(List<Flight> flights) {
        Connection connection = ConnectionUtil.getConnection();
        System.out.println("Начало записи в таблицу 'Flights'");
        for (Flight flight : flights)
        try (
                PreparedStatement statement = connection.prepareStatement(ADD_TO_FLIGHTS)
        ) {
            statement.setInt(1, flight.getId());
            statement.setInt(2, flight.getPlaneId());
            statement.setInt(3, flight.getPilotId());
            statement.setString(4, String.valueOf(flight.getDate()));
            statement.setString(5, String.valueOf(flight.getTime()));
            statement.setString(6, flight.getNumber());

            statement.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Запись в таблицу 'Flights' закончена");
    }
}
