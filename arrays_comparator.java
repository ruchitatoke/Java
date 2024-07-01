import java.util.*;
public class arrays_comparator {
    public static void main(String[] args) {

        int a[]={2,3,6,4,8,1};
        int b[]={1,2,3,4,5,6};

        System.out.println(Arrays.compare(a,b));
        System.out.println(Arrays.binarySearch(b,4));

        int c[]= Arrays.copyOf(a, 3);
        for(int x:c)
        System.out.print(" "+x);

            System.out.println();

        System.out.println( "The targeted element is: " +Arrays.binarySearch(a,6));

        System.out.println(Arrays.equals(a,b));

        System.out.println(Arrays.hashCode(a));

        System.out.println(Arrays.mismatch(a,b));

        
       
    }
}
