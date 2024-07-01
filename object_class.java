import java.lang.*;
public class object_class {
    public static void main(String[] args) {

        Object o = new Object();
        Object o1= new Object();
        Object o2=o;

        System.out.println(o.equals(o1));

        System.out.println(o2.equals(o));

        //o.notify();
        System.out.println(o.hashCode());
        System.out.println(o2.hashCode());
        System.out.println(o1.hashCode());
    }
}
