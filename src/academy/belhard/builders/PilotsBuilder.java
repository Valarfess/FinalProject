package academy.belhard.builders;

import academy.belhard.entity.Pilots;
import academy.belhard.entity.PilotsRang;

public class PilotsBuilder {
    public static Pilots builder(String pilotsline) {
        String[] pilotsData = pilotsline.split(";");

        int id = Integer.parseInt(pilotsData[0]);
        String firstName = pilotsData[1];
        String lastName = pilotsData[2];
        PilotsRang rang = PilotsRang.valueOf(pilotsData[3]);
        String code = pilotsData[4];

        return new Pilots (id, firstName, lastName, rang, code);
    }
}
