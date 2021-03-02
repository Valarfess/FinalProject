package academy.belhard.entity;

public class Plane {
    private int id;
    private String brand;
    private String model;
    private Integer passengerCapacity;
    private String tailNumber;

    public Plane(int id, String brand, String model, Integer passengerCapacity, String tailNumber) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.passengerCapacity = passengerCapacity;
        this.tailNumber = tailNumber;
    }

    public int getId() {
        return id;
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

    public String getTailNumber() {
        return tailNumber;
    }

    @Override
    public String toString() {
        return "Planes:" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", passengerCapacity='" + passengerCapacity + '\'' +
                ", tailNumber='" + tailNumber + '\'' +
                '.';
    }
}
