public class one {
    public static void main(String[] args) {
       A a =new A();
       a.m1();
       B b = new B();
       b.m1();
       b.m1();
    }
}
class A{
    int a =3;
    A(){
        int a =2;
        int b = 3;
        System.out.println(a+b);
    }
     void m1(){
        int c =3;
        int d =4;
        System.out.println(d-c);
    }
}
class B extends A{
    B(){
        System.out.println(a);
    }
     void m1(){
        System.out.println(a);
        
    }
}