public class reverse_array1 {
    public static void main(String[] args) {

        //Reversing an array without using swapping method

        int arr[] = {1,2,3,4,5};

        System.out.print("Original array is : " );
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

                    System.out.println();

        System.out.print("Reverse array is : " );
        for(int i=arr.length-1; i>=0 ; i--){
           
            System.out.print(arr[i] + " ");

        }
    }
}
