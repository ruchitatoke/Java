public class bubblesort {

public static void bubble(int arr[]){
    for(int turn=0; turn<arr.length-1;turn++){
        for(int j=0; j<arr.length-1-turn;j++){
            if(arr[j]<arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;

            }
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
    int arr[]= {3,6,2,1,8,7,4,5,3,1,2};
     System.out.println(arr);
bubble(arr);
printarr(arr);
}
}