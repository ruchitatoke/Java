public class classes {
    public static void main(String[] args) {
       Pen p1 = new Pen();
       p1.color = "blue";
       p1.type = "ball pen";
       p1.write();
       p1.printcolor();

       Pen p2 = new Pen();
       p2.color = "black";
       p2.type = "gel pen";
       p2.write();
       p2.printcolor();

       Pen p3 = new Pen();
       p3.pen("Blue", "Gel");

       Pen p4 = new Pen();
       p4.printcolor();

      
    }
    
}
class Pen{
        String color;
        String type;

        public void write(){
            System.out.println("Write");
        }
        public void printcolor(){
            System.out.println(this.color);
        }

        void pen(String color,String type){
            this.color = color;
            this.type = type;
            System.out.println("The colour and type of pen s respectively " + color +" & " + type);
        }
        
     
    }