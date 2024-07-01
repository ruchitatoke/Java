import java.util.*;
public class calender_timezone {
    public static void main(String[] args) {

        GregorianCalendar gc = new GregorianCalendar();

        TimeZone tz = gc.getTimeZone();

        //gc.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        
        System.out.println(tz);
        System.out.println(tz.getDisplayName());
        System.out.println(tz.getID());


        System.out.println(gc.isLeapYear(2002));
        System.out.println(gc.DAY_OF_WEEK);
        System.out.println(gc.getWeekYear());
        
    }
}
