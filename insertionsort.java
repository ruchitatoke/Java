import java.util.Arrays;

public class insertionsort {
    public static void main(String[] args) {
        int array[]={5,4,2,1,3};
        index(array);
        System.out.println(Arrays.toString(array));

    }
    public static void index(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr, j, j-1);
                }
                else{
                    break;
                }
            }
        }
    }
    public static void swap(int arr[],int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
