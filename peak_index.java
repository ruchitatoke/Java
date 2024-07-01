import java.util.Arrays;
//find the peak index i.e. the largest number in an array [1,2,3,6,3,2,1] ascending first after reaching
 //at its peak descending part starts
public class peak_index {
    public static void main(String[] args) {
        int array[]={1,2,3,6,3,2,1};
        int ans=peakindex(array);
        System.out.println(ans);
    }
    public static int peakindex(int arr[]){
        int start=0;
        int end=arr.length-1;

        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
}
