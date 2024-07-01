//product of digits using recursion

public class productofdigit_recursion {
    public static void main(String[] args) {

        int ans=prod(1342);    
        //1*3*4*2=24
        System.out.println(ans);
    }
    
    static int prod(int n){
        if(n%10==n){
            return n;
        }
        return (n%10) * prod(n/10);

    }
    
}
