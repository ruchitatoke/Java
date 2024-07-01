import java.util.*;

public class swap {
    public static void main(String args[]){

    int[] array = {1,2,45,11,7};
    swapfun(array, 1,3);

    System.out.println(Arrays.toString(array));


}
    public static void swapfun(int[] arr, int start, int target){
        int temp = arr [start];
        arr [start] = arr [target];
        arr [target] = temp;

    }
    
}
