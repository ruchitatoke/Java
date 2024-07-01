import java.util.*;
public class rotate_array {
  public static void main(String[] args) {
    int arr[] = {1,2,3,4,5};
    int n=2;

    System.out.println("Original array: ");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+ " ");
    }

    for(int i=0; i<n; i++){
        int j;
        int last;

        last = arr[arr.length-1];
        for(j=arr.length-1; j>0; j--){
            arr[j]=arr[j-1];
        }
        arr[0]=last;
    }
    System.out.println();
    System.out.println("Reverse array: ");
    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+ " ");
    }
  }

}
