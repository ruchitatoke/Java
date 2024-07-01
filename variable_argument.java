public class variable_argument {
    public static void main(String[] args) {
        
       // show(2,3,4,5); can be called directly if the function is static

       variable_argument va = new variable_argument();
        va.show(2, 3, 4, 5);
       
    }
    public  void show(int...A){ //Variable Arguments is a method that takes a variable number of arguments.
        for(int x :A){
            System.out.println(x);
        }
    }
}
