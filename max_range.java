//finding maximum element in an array in a specific range

public class max_range {
    public static void main (String args[]){
        int array[] = {12, 34, 45, 22, 99, 8, 23};
        
        range(array,2,4);
    }
    public static int range(int arr[],int start,int end){
        while(start<end){
            
        int maxval=Integer.MIN_VALUE;
        for( start=0;start<=end;start++){
            if(arr[start]>maxval){
                maxval=arr[start];
                
            }
        }
        System.out.println(maxval);
    }
    return -1;
    }
}
