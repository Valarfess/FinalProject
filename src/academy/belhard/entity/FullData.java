package academy.belhard.entity;

import java.util.Date;

public class FullData {
    private String number;
    private Date date;
    private Date time;
    private String tailNumber;
    private String brandModel;
    private Integer passengerCapacity;
    private String firstNameLast;
    private String codeRang;

    public FullData(String number, Date date, Date time, String tailNumber, String brandModel, Integer passengerCapacity, String firstNameLast, String codeRang) {
        this.number = number;
        this.date = date;
        this.time = time;
        this.tailNumber = tailNumber;
        this.brandModel = brandModel;
        this.passengerCapacity = passengerCapacity;
        this.firstNameLast = firstNameLast;
        this.codeRang = codeRang;
    }

    public String getNumber() {
        return number;
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

    public String getBrandModel() {
        return brandModel;
    }

    public Integer getPassengerCapacity() {
        return passengerCapacity;
    }

    public String getFirstNameLast() {
        return firstNameLast;
    }

    public String getCodeRang() {
        return codeRang;
    }

    @Override
    public String toString() {
        return "FullData:" +
                "number='" + number + '\'' +
                ", date=" + date +
                ", time=" + time +
                ", tailNumber='" + tailNumber + '\'' +
                ", brandModel='" + brandModel + '\'' +
                ", passengerCapacity=" + passengerCapacity +
                ", firstNameLast='" + firstNameLast + '\'' +
                ", codeRang='" + codeRang + '\'' +
                '.';
    }
}
