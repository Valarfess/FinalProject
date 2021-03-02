package academy.belhard.entity;

public class Pilots {
    private int id;
    private String firstName;
    private String lastName;
    private PilotsRang rang;
    private String code;

    public Pilots(int id, String firstName, String lastName, PilotsRang rang, String code) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.rang = rang;
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public PilotsRang getRang() {
        return rang;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "Pilots:" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", rang='" + rang + '\'' +
                ", code='" + code + '\'' +
                '.';
    }
}
