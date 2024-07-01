
public class linear_search {
    public static void main(String[] args) {
        int array[]={12,3,4,6,7,11,14};
        int ans= linear(array,11);
        System.out.println(ans);
    }
    public static int linear(int arr[],int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<=arr.length;i++){
            if(arr[i]==target){
                return i;
            }
            
        }
        return -1;
    }
}
