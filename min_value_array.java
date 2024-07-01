public class min_value_array {
public static void main(String[] args) {
    int array[]={2,12,3,6,7,5,1,11,4};
    int minval=ismin(array);
    System.out.println(minval);
}   
     public static int ismin(int arr[]){
        int ans=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<ans){
                ans=arr[i];
                return ans;
            }
        }
        return -1;
     } 
}
