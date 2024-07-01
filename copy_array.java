public class copy_array {
    public static void main(String[] args) {
        
        int arr[] = new int[] {1,2,3,4,5};
        int arr1[] = new int[arr.length];

        for(int i=0; i<arr.length;i++){
            arr1[i]=arr[i];
           
        }
        System.out.print("Elements of new array : ");
        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i]+ " ");
        }


    }
}
