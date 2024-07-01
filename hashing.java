import java.util.*;

public class hashing {
    public static void main(String[] args) {
        
        HashSet <Integer> hs = new HashSet<>(20, 0.75f);
        hs.add(4);
        hs.add(2);
        hs.add(12);
        hs.add(3);
        hs.add(2);
        hs.add(1);
        hs.add(11);

        System.out.println(hs);
    }

}
