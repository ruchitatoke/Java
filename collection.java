import java.util.*;
public class collection {
    public static void main(String[] args) {

        int arr[] = {2,3,4,1,3,56,7,32,2,5,3};

        List <Integer> l = new ArrayList<>();
        for(int i : arr){
            l.add(i);
        }
        System.out.println(l);

        for(int i=0; i<arr.length; i++){
           System.out.print(arr[i]);
        }
        

    }
}
