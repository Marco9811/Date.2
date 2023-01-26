import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Start {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();
        DateTimeFormatter x = DateTimeFormatter.ofPattern("dd-MMMM-yy / HH-mm");

        System.out.println(today.format(x));

        ZonedDateTime todayZoned = ZonedDateTime.now();
        DateTimeFormatter y = DateTimeFormatter.ISO_ZONED_DATE_TIME;

        System.out.println(todayZoned.format(y));
    }
}
