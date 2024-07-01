import java.util.Arrays;

public class linearsearch_twoD {
    public static void main(String[] args) {
        int array[][]={{2,3,4},{5,6,7},{8,9,1}};
        int target=6;
        int[] ans=twod(array,target);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] twod(int arr[][],int target){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr.length;col++){
                if(arr[row][col]==target){
                    return new int []{row,col};
                }
            } 
        }
        return new int[]{-1,-1};
    }
    
}
