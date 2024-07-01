public class Data_hiding {
    public static void main(String[] args) {
        Rectangle r= new Rectangle();
        r.setlength(3);
        r.setbreadth(3);
        r.area();
        System.out.println("Area is " + r.area());

    }
}
class Rectangle{
    private int length;
    private int breadth;


    public int getlength(){
        return length;
    }

    public void setlength(int l){
        length = 5;
    }
    public int getbreadth(){
        return breadth;
    }

    public void setbreadth(int b){
        breadth = b;
    }
     public int area(){
        return length*breadth;
        
    }
}
