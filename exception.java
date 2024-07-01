public class exception {
    public static void main(String[] args) {
        
        int a =8, b=0,c;
        
        try{
            c= a/b;
            System.out.println(c);
        }catch(ArithmeticException ae){
            System.out.println("Cannot be divided by 0");
        }
        
    }
}
