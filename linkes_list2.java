
import java.util.LinkedList;
import java.util.List;

public class linkes_list2 {
    public static void main(String[] args) {
        LinkedList <Integer> al1= new LinkedList<>();
        LinkedList <Integer> al2= new LinkedList<>(List .of(6,7,8,9,11,12));

        al1.add(3);
        al1.add(0,2);
        al1.addFirst(1);
        al1.addLast(15);
        al1.addAll(al2);
        al1.remove(3);
        System.out.println(al1.clone());
        System.out.println(al1.getFirst());
        System.out.println(al1.contains(5));
        

        System.out.println(al1);
    }
}
