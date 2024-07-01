import java.util.Arrays;

public class first_last_position {
public static void main(String[] args) {
    int arr[]={2,3,3,5,6,7};
    int[] answer=search(arr,3);
    System.out.println(Arrays.toString(answer));
}    
public static int[] search(int arr[],int target){
    int[] ans={-1,-1};
    int start=binary(arr,target,true);
    int end=binary(arr,target,false);
    ans[0]=start;
    ans[1]=end;

    return ans;
}
public static int binary(int arr[],int target,boolean find){
    int ans=-1;
    int start=0;
    int end=arr.length-1;

    while(start<=end){
        int mid=start+(end-start)/2;
        if(target<arr[mid]){
         end=mid-1;
        }
        else if(target>arr[mid]){
            start=mid+1;
        }
        else{
            return mid;
        }

    }
    return start;
} 
}
