//import java.util.Arrays;
public class example {
    public static void main(String[] args) {
    A a = new A();
    a.display();

    B b = new B();
    b.display();

    }
}
class A{

    int a= 10;
    static int b = 5;
{
    if(a != b){
        System.out.println("Not equal");
    }
    else{
        System.out.println("Equal");
    }
}
    void display(){
        System.out.println(b);
    }
}

class B extends A{
    int d = 2;
    int c = 5;
    int b=2;
      void display(){
        System.out.println(b);
    }


}
