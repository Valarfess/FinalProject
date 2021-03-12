package academy.belhard.constants;

public class Constants {
    public static final String DELIMETR = ";";

    public static final String URL = "jdbc:mysql://localhost:3306/airport_db?useUnicode=true&serverTimezone=UTC";
    public static final String USER = "root";
    public static final String PASS = "Valar211922fess";

    public static final String SELECT_FULL_DATA = "SELECT fl.number, fl.date, fl.time, pl.tailNumber, CONCAT_WS (' ',pl.brand, pl.model), pl.passengerCapacity, "+
            "CONCAT(CONCAT_WS(' ',pi.firstName, SUBSTR(pi.lastName, 1, 1)),'.'), CONCAT_WS (' ', pi.code, (CONCAT ('(',pi.rang,')'))) " +
            "FROM flights AS fl "+
            "JOIN planes AS pl ON fl.plane_id = pl.id " +
            "JOIN pilots AS pi ON fl.pilot_id = pi.id";

    public static final String BRANDMODEL = "CONCAT_WS (' ',pl.brand, pl.model)";
    public static final String FIRSTNAMELAST = "CONCAT(CONCAT_WS(' ',pi.firstName, SUBSTR(pi.lastName, 1, 1)),'.')";
    public static final String CODERANG = "CONCAT_WS (' ', pi.code, (CONCAT ('(',pi.rang,')')))";
}
