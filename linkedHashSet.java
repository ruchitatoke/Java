import java.util.*;

public class linkedHashSet {
    public static void main(String[] args) {
        
        LinkedHashSet <Integer> lhs = new LinkedHashSet<>(10);

        lhs.add(10);
        lhs.add(20);
        lhs.add(1);
        lhs.add(14);
        lhs.add(8);
        lhs.add(2);

        Iterator <Integer> itr = lhs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        //lhs.forEach(System.out::println);
    }
}
