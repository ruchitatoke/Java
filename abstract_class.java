public class abstract_class {
    public static void main(String[] args) {
       Abstract_ex a = new Sub();
       a.display();
       a.display1();

        Sub s = new Sub();
        s.display();
        s.display1();

    }
}
abstract class Abstract_ex{
    abstract public void display();

    public void display1(){
        System.out.println("Normal method");
    }
     
}
abstract class ex extends Abstract_ex{  // abstract class can extend another abstract class and override methods
                                        // abstract class can have contructors

    public void display(){
        System.out.println("Extended by another absract class");
    }

}
class Sub extends Abstract_ex{
                 
    public void display(){
        System.out.println("Derived method");
    }
    
}
