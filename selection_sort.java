import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        int array[]={3,8,5,4,9,1};
        selection(array);
        System.out.println(Arrays.toString(array));
    }
    public static void selection(int arr[]){
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
           int ans=maxindex(arr,0, last);
           swap(arr, ans, last);

        }
    } 
    public static int maxindex(int arr[],int start,int end){
        int max=start;
        for(int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
}
    public static void swap(int arr[],int first,int last){
        int temp=arr[first];
        arr [first]=arr[last];
        arr[last]=temp;
    }
}
