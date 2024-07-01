import java.util.*;
public class arraylist {
    public static void main(String[] args) {

        List <Integer> al1= new ArrayList<>(20);
        ArrayList <Integer> al2= new ArrayList<>(List .of(13,7,10,9,16,12));
        
        al1.sort(null);
        al1.add(3);
        al1.add(0,2);
        al1.addFirst(1);
        al1.addLast(15);
        al1.addAll(al2);
        al1.remove(3);
        
        System.out.println(al1.contains(5));
        
        Iterator <Integer> it = al1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());

        }

        System.out.println(al1);

        
    }
}
