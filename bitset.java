import java.util.*;
public class bitset {
    public static void main(String[] args) {
        
        BitSet bs = new BitSet();
        bs.set(2);
        bs.set(3);
        bs.set(4);
        bs.set(4);
        bs.set(5);

        BitSet bs1 = new BitSet();
        bs1.set(9);
        bs1.set(3);
        bs1.set(4);
        bs1.set(6);
        bs1.set(8);
        bs1.set(1);

        bs.and(bs1);
        System.out.println(bs1);
    }
}
