import java.util.Arrays;

public class cycle_sort {
    public static void main(String[] args) {
        int array[]={3,4,2,1};
        cycle(array);
        System.out.println(Arrays.toString(array));

    }
    public static void cycle(int arr[]){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
    }
    public  static void swap(int arr[],int first,int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
    
}
