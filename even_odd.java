import java.util.*;
public class even_odd {
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter number : " );
        int n= sc.nextInt();
        //int x=1;
       if(n % 2 == 0){
        System.out.print("Even");
    
       }
    else{
        System.out.print("ODD");
    }  
    sc.close();  
}
}