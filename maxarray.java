public class maxarray {
    public static void main (String args[]){
        int array[] = {12, 334, 22, 9, 8, 23};
        maxfun(array);
       
    }
    
    public static int maxfun(int arr[]){
        int max=arr[0];
        for(int i=0; i<arr.length;i++){
        if(max < arr[i]){
            max=arr[i];
            System.out.println(max);
        }
        
    }
return -1;
    }
    
}
