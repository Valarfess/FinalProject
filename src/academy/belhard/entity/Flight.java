package academy.belhard.entity;
import java.sql.Time;

import java.util.Date;


public class Flight {

    private int id;
    private int planeId;
    private int pilotId;
    private Date date;
    private Time time;
    private String number;

    public Flight(int id, int planeId, int pilotId, Date date, Time time, String number) {
        this.id = id;
        this.planeId = planeId;
        this.pilotId = pilotId;
        this.date = date;
        this.time = time;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public int getPlaneId() {
        return planeId;
    }

    public int getPilotId() {
        return pilotId;
    }

    public Date getDate() {
        return date;
    }

    public Time getTime() {
        return time;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Flights:" +
                "id=" + id +
                ", planeId=" + planeId +
                ", pilotId=" + pilotId +
                ", date=" + date +
                ", time=" + time +
                ", number='" + number +
                '.';
    }
}
