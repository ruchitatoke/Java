public class method_overriding {
    public static void main(String[] args) {
        Super s = new Super();
        s.display();
        Sub sb = new Sub();
        sb.display();
        Super sp = new Sub();
        sp.display();
        
    }
}
class Super{
     public void display(){
        System.out.println("HELLO ");
     }
}
class Sub extends Super{

    @Override                    //Annotation
    public void display(){
        System.out.println("Ruchita here ");
    }
}