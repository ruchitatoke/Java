public class order_agnostic {
    public static void main(String[] args) {
        int array[]={22,43,4,5,6,78};
        int ans=binarysearch(array, 6);
        System.out.println(ans);

    }
    public static int binarysearch(int arr[],int target){
        int start=0;
        int end=arr.length-1;

           boolean isAsc=arr[start]<arr[end];
         while(start<=end){

            int mid=start+(end-start)/2;

            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                end= mid-1;
            }else {
                start =mid+1;
            }}
            else{
                if(target>arr[mid]){
                end= mid-1;
            }
            else {
                start=mid+1;
            }
            }
 
         }
         return -1;
    }
}
