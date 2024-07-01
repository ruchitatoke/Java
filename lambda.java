public class lambda {
    public static void main(String[] args) {
        A a =()->{
            System.out.println("Hello ");
        };
        a.display();
    }
}

interface A {
        public void display();  //called as functional interface because interface A has only one method
    
}
