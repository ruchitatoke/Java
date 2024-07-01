public class interface_pr {
    public static void main(String[] args) {
        A a = new B();
        a.meth1();
        a.meth2();
       
        B b = new B();
        b.meth1();
        b.meth2();
        b.meth3();
        b.meth4();
        b.method5();
        int c = b.me();
        System.out.println("Value of c: " + c);

    }
}

interface A{
    void meth1();
    void meth2();
    final int a=2; // null initialization is not allowed
                    // only final, static,public variable is allowed
    int b = 3;
}
class B implements A{

   public void meth1(){ // this overriden method must be public otherwise it will show error
                        // we must write public for implementing A so that methods can be implemented by the classes.

        System.out.println("This is method 1 ");
    }
     public void meth2(){
        System.out.println("This is method 2");
    }

    void meth3(){
        System.out.println("This is method 3");
    }

    void meth4(){
    System.out.println(a);
   }
    void method5(){
    System.out.println(b);
   }
     public int me(){
    int a =2;
    int b=3;
    return a+b;
   }

}