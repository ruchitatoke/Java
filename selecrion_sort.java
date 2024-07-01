public class selecrion_sort {
    public static void sort(int arr[]){
        for(int i=0; i<arr.length-1;i++){
            int minpos=i;
            for(int j=i+1; j<arr.length;j++){
                if(arr[minpos]>arr[j]){
                    minpos=j;
                }
                    int temp=arr[minpos];
                    arr[minpos]=arr[i];
                    arr[i]=temp;
    
                }
            }
        }
     
    
    
    public static void printarr(int arr[]){
         for(int i=0;i<=arr.length;i++){
            System.out.println(arr[i]+" ");
         }
         System.out.println();
    }
    public static void main(String args[]){
        int arr[]= {3,6,1,8,7,4,5,3,1};
         System.out.println(arr);
        sort(arr);
    printarr(arr);
    }
}
