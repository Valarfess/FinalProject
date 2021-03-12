package academy.belhard.builders;

import academy.belhard.entity.Plane;

import static academy.belhard.constants.Constants.DELIMETR;

public class PlanesBuilder {
    public static Plane builder(String planesline) {
        String[] planesData = planesline.split(DELIMETR);

        int id = Integer.parseInt(planesData[0]);
        String brand = planesData[1];
        String model = planesData[2];
        Integer passengerCapacity = Integer.parseInt(planesData[3]);
        String tailnumber = planesData[4];

        return new Plane(id, brand, model, passengerCapacity, tailnumber);
    }
}
