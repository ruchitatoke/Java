public class ceiling_of_no {
    public static void main(String[] args) {
        int array[]={2,3,4,6,7,9};
        int target=5;
        int ans=binary(array,target);
        System.out.println(ans);

        
    }
    public static int binary(int arr[],int target){
        if(target>arr[arr.length-1]){
            return -1;
        }
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
