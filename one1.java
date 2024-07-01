import java.util.Arrays;

public class one1 {
    public static void main(String[] args) {
        int arr[][]  = {{10, 20, 30},
                        {40,50,60},
                        {70,80,90}};
         

  for (int[] is : arr) {
    for(int i : is){
        System.out.print(i+" ");
    }
    System.out.println();
}

System.out.println();

        for(int i=0; i<3;i++){
            for(int j =0;j<3 ; j++ ){
                System.out.print(arr[i] [j]+" ");
            }
           System.out.println();
        }
        System.out.println(Arrays.deepToString(arr));

    }
}
