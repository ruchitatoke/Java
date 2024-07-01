import java.util.*;

public class treeset {
    public static void main(String[] args) {
        
        TreeSet <Integer> ts = new TreeSet<>(List .of(10,20,30,40,50,10));
        ts.add(25);
        

        System.out.println( "The ceiling of the number is : " +ts.ceiling(32));

        System.out.println("The floor of the number is : " +ts.floor(15));

        System.out.println(ts.isEmpty());

        System.out.println(ts.size()); // output is 6 because 10 is duplicate so it will count it's size

        System.out.println(ts.getClass());
       

        ts.add(10); //duplicates is not allowed so it will not print 10 two times

        System.out.println(ts);
    }
}
