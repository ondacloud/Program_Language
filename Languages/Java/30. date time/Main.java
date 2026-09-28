import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
public class Main {
    public static void main(String[] args) throws Exception {
        LocalDate today = LocalDate.now();
        LocalDateTime now = LocalDateTime.now();
        ZonedDateTime seoul = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));

        String formatted = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(formatted);
    }
}
