public class read_only {
    public static void main(String[] args) {
        Rectangle r= new Rectangle(3, 4);
        int ans=r.area();
        System.out.println("Area of Rectangle is " +ans);
    }
    
}
class Rectangle{
    private int length;
    private int breadth;

    public Rectangle(int l, int b ){
        length=l;
        breadth=b;
          
    }
     public int area(){
        return length*breadth;
     }
   
}