public class insertion_sort {
    public static void insertionsort(int arr[]){
        for(int i=0; i<arr.length;i++){
           int curr=1;
           int prev=i+1;
           while(prev>=0 && arr[prev]>arr[curr]){
            arr[prev+1]=arr[prev];
            prev--;
           }
    arr[prev+1]=arr[curr];
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
        insertionsort(arr);
    printarr(arr);
    }
}
