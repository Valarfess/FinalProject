package academy.belhard.entity;

import java.util.Date;

public class FullData {
    private Integer id;
    private Date date;
    private Date time;
    private String tailNumber;
    private String brand;
    private String model;
    private Integer passengerCapacity;
    private String firstName;
    private String lastName;
    private String code;
    private PilotRang rang;

    public FullData(Integer id, Date date, Date time, String tailNumber, String brand, String model, Integer passengerCapacity, String firstName, String lastName, String code, PilotRang rang) {
        this.id = id;
        this.date = date;
        this.time = time;
        this.tailNumber = tailNumber;
        this.brand = brand;
        this.model = model;
        this.passengerCapacity = passengerCapacity;
        this.firstName = firstName;
        this.lastName = lastName;
        this.code = code;
        this.rang = rang;
    }

    public Integer getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public Date getTime() {
        return time;
    }

    public String getTailNumber() {
        return tailNumber;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getPassengerCapacity() {
        return passengerCapacity;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCode() {
        return code;
    }

    public PilotRang getRang() {
        return rang;
    }

    @Override
    public String toString() {
        return "FullData:" +
                "id-" + id +
                ", date-" + date +
                ", time-" + time +
                ", tailNumber-'" + tailNumber + '\'' +
                ", " + brand + " " + model +
                ", passengerCapacity-" + passengerCapacity +
                ", firstName-'" + firstName + '\'' +
                ", lastName-'" + lastName + '\'' +
                ", code-" + code +
                " (" + rang + ")" +
                '.';
    }
}
