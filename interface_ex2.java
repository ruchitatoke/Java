public class interface_ex2 {
    public static void main(String[] args) {
        
        A a = new A();
        a.meth1();
        a.meth2();

        A a1 = new D();
        a1.meth2();
         
       D d = new D();
       d.meth1();
       d.meth2();
       d.meth3();
       d.meth4();
       d.meth5();
       d.meth6();
       d.display();
    }
}
class A{
    void meth1(){
        System.out.println("Class method");
    }
    void meth2(){
        System.out.println("Methos 2 of class");
    }
     final void display(){
        System.out.println("HI");

    }

}
interface B{

    void meth3();
    void meth4();
}
interface C{

    void meth5();

}
class D extends A implements B, C{

    public void meth3(){
        System.out.println("Mehod 3 of interface B called in D class");
    }
    public void meth4(){
        System.out.println("Mehod 4 of interface B called in D class");
    }
    public void meth5(){
        System.out.println("Mehod 5 of interface C called in D class");
    }
   public void meth6(){
          System.out.println("Hey");
   }
   public void meth1(){
    System.out.println("hi");
   }
}