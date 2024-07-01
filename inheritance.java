public class inheritance {
    public static void main(String[] args) {
        Parent p1=new Parent();
        p1.color="white";
        p1.height="5 ft";
        p1.printheight();
        System.out.println(p1.color);
        

        Child c1=new Child();
        c1.hairs="curly";
        c1.color="black";
        c1.meth1();
        System.out.println(c1.hairs);
        System.out.println(c1.color);
        
    }
   
}
 class Parent{
    
        String color;
        String height;
        void printheight(){
        System.out.println(this.height);
        }

        final void meth1(){
            System.out.println("Final");
        }
    }
    class Child extends Parent{
        String hairs;

    }