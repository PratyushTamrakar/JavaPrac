import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime{
    public static void main(String[] args){


        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2026,12,12);
        System.out.println(date1);
        System.out.println(date2);
        System.out.println();

        LocalTime time1 = LocalTime.now();
        LocalTime time2 = LocalTime.of(1,58,28);
        System.out.println(time1);
        System.out.println(time2);
        System.out.println();

        LocalDateTime dateTime1 = LocalDateTime.now();
        LocalDateTime dateTime2 = LocalDateTime.of(2026,12,28,10,5,28);
        System.out.println(dateTime1);
        System.out.println(dateTime2);
        System.out.println();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd \t  hh-mm-ss");
        String newDateTime2 = dateTime2.format(formatter);
        System.out.println(newDateTime2);


    }
}