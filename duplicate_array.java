public class duplicate_array {
    public static void main(String[] args) {
        
        int arr[]={2,3,4,5,2,6,3,5};
        duplicate(arr);
    }

    public static void duplicate(int array[]){
        for(int i=0;i<array.length;i++){
            for(int j=i+1; j<array.length;j++){
                if(array[i]==array[j]){
                    System.out.println(array[j]);
                }
            }

        }
    }
}
