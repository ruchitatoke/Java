import java.util.*;
import java.time.*;
import java.time.temporal.*;
import java.time.format.*;

public class data_time {
    public static void main(String[] args) {

        System.out.println(System.currentTimeMillis());

        System.out.println(System.currentTimeMillis()/60);

        Date d = new Date("9/11/2002");
        System.out.println("It was : " + d + " in the year 2002");

        Date d1 = new Date();
        System.out.println("Today's date is: " +d1);

        Date d2 = new Date("9/2/2024");
        System.out.println(d2.getMonth());  // As months start from 0 it will show 8 instead of 9

        Date d3 = new Date("9/11/2002");
        System.out.println(d3.getYear() +1900); //after adding 1900 it will show correct year as it starts from 1900

       // DATE AND TIME FORMAT

        LocalDateTime ld = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(df.format(ld));
    }
}
