//Print the number from n to 1 using recursion 

public class n_to_one_recursion {
    public static void main(String[] args) {
        fun(5);
        
    }
    public static void fun(int n){
        if(n==0){
            return ;
        }
        fun(n-1);    //function will execute and then will print the number
        System.out.println(n);

        //fun(n-1);   // function will print the number and then execute
    }
}
