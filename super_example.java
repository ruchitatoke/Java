public class super_example {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(2, 3);
        Cuboid c = new Cuboid(2, 4, 1);
        c.display();
        c.print();
    }

}
class Rectangle{
    int length;
    int breadth;
    int x= 10;

    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;

        System.out.println(length*breadth);
    }
    public void print(){
        System.out.println("length is " + length+ "and breadth is " + breadth);
    }
    
}
class Cuboid extends Rectangle{
           int height;
           int x=20;

           Cuboid(int l, int b, int h){
                super(l,b);
                height = h;
                System.out.println(l*b*h);
                
           }
           void display(){
            System.out.println(super.x);
            System.out.println(x);
           }
}