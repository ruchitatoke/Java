// if you want to execute the statement or blocks before the constructor i.e ashish constructor
// then we use {} for and if you want before {} then use static 

public class example3 {
    public static void main(String[] args) {
        Ashish a = new Ashish();
    }
}
class Ashish{
    static{
        System.out.println("static block");
    }
    {
        System.out.println("curly");
    }
    Ashish(){
        System.out.println("Ashish here");
    }
}