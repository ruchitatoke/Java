import java.util.Arrays;
//Arrange the elements of array in Ascending/Descending order

public class bubble_sort {
    public static void main(String[] args) {
        int arr[]={4,5,6,3,2,1};
         bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubble(int arr[]){
        boolean swapped;
        for(int i=0;i<arr.length;i++){
            swapped=false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){      //for desc just replace '<' with '>' 
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if(swapped==false){
                break;
            }
        }
        
    }
}
