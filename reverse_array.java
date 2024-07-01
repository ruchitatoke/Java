import java.util.Arrays;

public class reverse_array {
    public static void main(String[] args) {
        int array[]={2,3,4,6,7,8,9};
        reverse(array,0,6);
        System.out.println(Arrays.toString(array));
        
    }

    public static void reverse(int arr[],int start,int end){
        
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    public static void swap(int arr[], int index1,int index2){
            int temp=arr[index1];
            arr[index1]=arr[index2];
            arr[index2]=temp;

        }
}
