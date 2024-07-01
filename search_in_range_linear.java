public class search_in_range_linear {
 public static void main(String[] args) {
    int array[]={12,34,2,4,6,7,11,9};
    int ans=range(array,1,5,4);

    System.out.println(ans);

 }  
 public static int range(int arr[],int start,int end,int target){
    if(arr.length==0){
        return -1;
    }
    while(start<=end){
        for(int i=0;i<arr.length;i++){
            if(target==arr[i]){
                return i; 
            }

        }
    }
    return -1;
 } 
}
