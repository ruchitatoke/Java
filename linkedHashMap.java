import java.util.*;
public class linkedHashMap {
    public static void main(String[] args) {
        
        LinkedHashMap <Integer, String> lhm = new LinkedHashMap<>();

        lhm.put(0, "A");
        lhm.put(1, "B");
        lhm.put(2, "C");
        lhm.put(5, "D");
        lhm.put(4, "E");
        System.out.println(lhm.size());

        lhm.forEach((k,v) -> System.out.println(k + " " +v));
    }

}
