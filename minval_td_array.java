import java.util.Arrays;

public class minval_td_array {
 public static void main(String[] args) {
     int array[][]={{22,3,2},{6,5,7},{8,9,11}};
        int[] ans=twod(array);
        System.out.println(Arrays.toString(ans));
        int ans1=indexval(array);
        System.out.println(ans1);
       
    }
    public static int[] twod(int arr[][]){
        int minval=arr[0][0];
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr.length;col++){
                if(arr[row][col]<minval){
                    return new int []{row,col};
                }
            } 
        }
        return new int[]{-1,-1};
    }
    public static int indexval(int arr[][]){
        int minval=arr[0][0];
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr.length;col++){
                if(arr[row][col]<minval){
                    minval=arr[row][col];
                    //return minval;
                }
            } 
        }
        return minval;
    }

 }   

