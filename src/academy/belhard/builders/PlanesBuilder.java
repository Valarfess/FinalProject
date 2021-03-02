package academy.belhard.builders;

import academy.belhard.entity.Planes;

public class PlanesBuilder {
    public static Planes builder(String planesline) {
        String[] planesData = planesline.split(";");

        int id = Integer.parseInt(planesData[0]);
        String brand = planesData[1];
        String model = planesData[2];
        Integer passengerCapacity = Integer.parseInt(planesData[3]);
        String tailnumber = planesData[4];

        return new Planes (id, brand, model, passengerCapacity, tailnumber);
    }
}
