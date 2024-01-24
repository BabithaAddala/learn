package tap;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateConverter {
    public static void main(String[] args) {
        System.out.println("***INSTANT TIME***" + Instant.now());
        System.out.println("***LocalDateTime***" + LocalDateTime.now());
        System.out.println("***ZonedDate time***" + ZonedDateTime.now());

        System.out.println("RESULT___" + converter());
    }

    private static String converter() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYYMMDDHHmmss")
                .withZone(ZoneId.systemDefault());

        Instant instant = Instant.parse("2022-02-15T18:35:24.00Z");
        String formattedInstant1 = formatter.format(instant);
        System.out.println("formattedInstant1" + formattedInstant1);
        String formattedInstant = formatter.format(Instant.now());

        return formattedInstant;
    }
}
