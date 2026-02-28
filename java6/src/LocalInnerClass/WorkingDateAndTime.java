package LocalInnerClass;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class WorkingDateAndTime {
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();
        System.out.println("date:"+date);
        LocalTime time=LocalTime.now();
        System.out.println("time:"+time);
        LocalDateTime dateTime=LocalDateTime.now();
        System.out.println("date&time:"+dateTime);
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("D,MMM dd yyy");
        String FormatterDateTime=dateTime.format(formatter);
        System.out.println("formatted date:"+ FormatterDateTime);
    }
}
