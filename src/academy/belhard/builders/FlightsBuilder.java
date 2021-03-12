package academy.belhard.builders;

import academy.belhard.entity.Flight;

import java.sql.*;
import java.sql.Date;

import static academy.belhard.constants.Constants.DELIMETR;


public class FlightsBuilder {

    public static Flight builder(String flightsline) {
        String[] flightsData = flightsline.split(DELIMETR);

        int id = Integer.parseInt(flightsData[0]);
        int planeId = Integer.parseInt(flightsData[1]);
        int pilotId = Integer.parseInt(flightsData[2]);
        Date date = Date.valueOf(flightsData[3]);
        Time time = Time.valueOf(flightsData[4]);
        String number = flightsData[5];

        return new Flight(id, planeId, pilotId, date, time, number);
    }
}
