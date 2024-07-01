
public class generics {

    public static void main(String[] args) {
        generics.GenericDemo<Integer> gd = new generics.GenericDemo<>();

        gd.data[0] = 1;
        gd.data[1] = 2;
        
    }

    public static class GenericDemo<T> {

        T[] data;

        public GenericDemo() {
            data = (T[]) new Object[3];
           
        }
    }
}
