//search a element in an array using binary search

public class binary_search {
    public static void main(String[] args) {
        int array[]={1,3,4,5,7,8,12,13,14,15};
        int ans=isbinary(array, 14);
        System.out.println(ans);

    }
    public static int isbinary(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }

        }
        return -1;
    }
}
