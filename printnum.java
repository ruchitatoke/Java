import java.util.*;

public class printnum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int counter=0;
        while(counter<=range){
            System.out.println(counter + " ");
            counter++;
        
        }  
        System.out.println();
        sc.close();
    }
}
