package academy.belhard.builders;

import academy.belhard.entity.Pilot;
import academy.belhard.entity.PilotRang;

import static academy.belhard.constants.Constants.DELIMETR;

public class PilotsBuilder {
    public static Pilot builder(String pilotsline) {
        String[] pilotsData = pilotsline.split(DELIMETR);

        int id = Integer.parseInt(pilotsData[0]);
        String firstName = pilotsData[1];
        String lastName = pilotsData[2];
        PilotRang rang = PilotRang.valueOf(pilotsData[3]);
        String code = pilotsData[4];

        return new Pilot(id, firstName, lastName, rang, code);
    }
}
