package academy.belhard.db.writer;

import academy.belhard.db.connection.ConnectionUtil;
import academy.belhard.entity.Flight;
import academy.belhard.entity.Pilot;
import academy.belhard.entity.Plane;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SQLDataWriter {
    private static final String ADD_TO_PILOTS = "INSERT INTO pilots (id, firstname, lastname, rang, code) VALUES(?, ?, ?, ?, ?)";
    private static final String ADD_TO_PLANES = "INSERT INTO planes (id, brand, model, passengercapacity, tailnumber) VALUES(?, ?, ?, ?, ?)";
    private static final String ADD_TO_FLIGHTS = "INSERT INTO flights (id, plane_id, pilot_id, date, time, number) VALUES(?, ?, ?, ?, ?, ?)";

    public static void addToPilots(Pilot pilot) {
        Connection connection = ConnectionUtil.getConnection();
        try (
                PreparedStatement statement = connection.prepareStatement(ADD_TO_PILOTS)
        ) {
            System.out.println("Начало записи в таблицу 'Pilots'");
            statement.setInt(1, pilot.getId());
            statement.setString(2, pilot.getFirstName());
            statement.setString(3, pilot.getLastName());
            statement.setString(4, String.valueOf(pilot.getRang()));
            statement.setString(5, pilot.getCode());

            statement.executeUpdate();
            System.out.println("Запись в таблицу 'Pilots' закончена");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void addToPlanes(Plane plane) {
        Connection connection = ConnectionUtil.getConnection();
        try (
                PreparedStatement statement = connection.prepareStatement(ADD_TO_PLANES)
        ) {
            System.out.println("Начало записи в таблицу 'Planes'");
            statement.setInt(1, plane.getId());
            statement.setString(2, plane.getBrand());
            statement.setString(3, plane.getModel());
            statement.setInt(4, plane.getPassengerCapacity());
            statement.setString(5, plane.getTailNumber());

            statement.executeUpdate();
            System.out.println("Запись в таблицу 'Planes' закончена");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void addToFlights(Flight flight) {
        Connection connection = ConnectionUtil.getConnection();
        try (
                PreparedStatement statement = connection.prepareStatement(ADD_TO_FLIGHTS)
        ) {
            System.out.println("Начало записи в таблицу 'Flights'");
            statement.setInt(1, flight.getId());
            statement.setInt(2, flight.getPlaneId());
            statement.setInt(3, flight.getPilotId());
            statement.setString(4, String.valueOf(flight.getDate()));
            statement.setString(5, String.valueOf(flight.getTime()));
            statement.setString(6, flight.getNumber());

            statement.executeUpdate();
            System.out.println("Запись в таблицу 'Flights' закончена");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
