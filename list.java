import java.util.*;
public class list {
    public static void main(String[] args) {
        List<Integer> alist = new ArrayList<>();
        alist.add(2);
        alist.add(3);
        alist.add(4);
        alist.add(8);
        alist.add(1);
        System.out.println(alist);

        Collections.sort(alist);
        alist.sort(null); // when we want to sort in ascending we will write null
        System.out.println(alist);

        alist.sort((o1,o2)-> (o2-o1)); // for descending we write lambda function
        System.out.println(alist);
    
    }
}
