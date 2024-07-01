public class min_array {
    public static void main(String[] args) {
        
        int arr[] = {34,56,78,12,2,90,14};

        int min=arr[0];
        for(int i=0; i < arr.length; i++){
            
            if(arr[i] < min)
                min = arr[i];
            
        }
        System.out.println("Minimum element of an array is : " + min);
    }
}
