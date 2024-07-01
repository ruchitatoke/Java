import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class third_largest {
    public static void main(String[] args) {
        
        int arr[]={1,2,8,4,3,6,7};

        System.out.println(thirdlargest(arr, 7));

        System.out.println(largest_3(arr, 7));

        Integer a[]={1,2,5,6,3,2,7};  
        System.out.println(getThirdLargest(a, 7));

    }

    // METHOD 1

    public static int thirdlargest(int arr[],int total) {
        for(int i=0; i<total; i++){
            for(int j=i+1; j<total ; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
            return arr[total-3];
    }


    // METHOD 2 

    public static int largest_3 (int arr[],int total) {
        Arrays.sort(arr);
        return arr[total-3];
    }


    // METHOD 3 

    public static int getThirdLargest(Integer[] a, int total) {  

          List<Integer> list=Arrays.asList(a);  
           Collections.sort(list);  
            int element=list.get(total-3);  
            return element;  

}  

    
}
