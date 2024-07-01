//import java.util.*;
public class string_input {
    public static void main(String[] args) {
       Pen p1=new Pen();
       p1.color="blue";
       p1.type="smooth";
       p1.setprice("45");
       System.out.println(p1.type);
       p1.write();
       p1.printcolor();

       reynolds r1=new reynolds();
       r1.price="20";
       r1.color="black";
       r1.printcolor();
       r1.printprice();
    }
}
class Pen{
    String type;
    String color;
    private String price;

   
    public void setprice(String pr){
        price=pr;
        System.out.println(this.price);

    }

    public void printcolor(){
        System.out.println(this.color);
    }
    public void write(){
        System.out.println("print anything");
    }
}
class reynolds extends Pen{
    String price;

    public void printprice(){
        System.out.println(this.price);
    }
    
}