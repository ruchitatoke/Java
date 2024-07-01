public class example2 {
    public static void main(String[] args) {
        Triangle t = new Triangle(2, 3);
        Triangle t1 = new Triangle(3.1, 2.4);

        System.out.println(t.pythagorus());
        System.out.println(t1.pythagorus());
    }
}
class Triangle{
    private double a;
    private double b;

    Triangle(double a1, double b1){
        this.a=a1;
        this.b=b1;
    }

    public double pythagorus(){
        return a*a + b*b;
    }
    public void seta1(double a1){
        this.a= a1;
    }
    public double geta1(){
        return a;
    }
    public void setb1(double b1){
        this.b= b1;
    }
    public double getb1(){
        return b;
    }

}