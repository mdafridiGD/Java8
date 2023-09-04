package newDateTimeApi;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class NewDateTime {
    public static void main(String[] args) {


        // Old Date API

        Date oldDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println("Old Date and Time (Before modification): " + sdf.format(oldDate));
        oldDate.setYear(2000); // Modifying the year

        System.out.println("Old Date and Time (After modification): " + sdf.format(oldDate));

        // New Date and Time API
        LocalDateTime newDate = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        System.out.println("New Date and Time (Before modification): " + dtf.format(newDate));
        newDate = newDate.withYear(2000); // Creating a new LocalDateTime instance with modified year

        System.out.println("New Date and Time (After modification): " + dtf.format(newDate));


//        new date time api methods
        LocalDate currentDate = LocalDate.of(2002,12,28);                //smart enough
        System.out.println("Current Date: " + currentDate);

        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time: " + currentTime);


        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date-Time: " + currentDateTime);


        LocalDateTime zoned=LocalDateTime.now(ZoneId.of("Asia/Kuwait"));
        System.out.println("zoned time of Kuwait "+zoned);

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("Zoned Date-Time: " + zonedDateTime);

//      Duration is used for measuring time in terms of hours, minutes, seconds
        Duration duration = Duration.ofMinutes(1);
        System.out.println("Duration: " + duration);

//      Period is used for measuring time in terms of years, months, and days.
        Period period = Period.ofMonths(1);
        System.out.println("Period: " + period);

//       GMT
        Instant instant = Instant.now();//
        System.out.println("Instant: " + instant);


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("Formatted Date-Time: " + formattedDateTime);

        LocalDateTime newDateTime = currentDateTime.withYear(2024).withMonth(6).withHour(15);
        System.out.println(newDateTime);


    }
}