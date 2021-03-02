package academy.belhard.entity;

public class Pilot {
    private int id;
    private String firstName;
    private String lastName;
    private PilotRang rang;
    private String code;

    public Pilot(int id, String firstName, String lastName, PilotRang rang, String code) {
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

    public PilotRang getRang() {
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
