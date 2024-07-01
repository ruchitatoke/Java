import java.util.*;
public class properties {
   public static void main(String[] args) {
    
    Properties pr = new Properties();
    pr.setProperty("A", "Ruchita");
    pr.setProperty("B", "Shrutika");
    pr.setProperty("C", "Shreysha");
    pr.setProperty("D", "Ashish");
    pr.setProperty("E", "Srushti");

    System.out.println(pr);
    System.out.println(pr.getProperty("B"));
   }

}
