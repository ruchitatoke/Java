import java.util.*;
public class unique {
    public static void main(String[] args) {
        int arr[]= {1,2,3,45,6,7,21,45,1,46,2,4,3,5,3};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        Set<Integer> hset = new HashSet<>();
        for(int i : arr){
            hset.add(i);
       }
       System.out.println(hset);
    }
}
