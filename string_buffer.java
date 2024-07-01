import java.util.*;
public class string_buffer {
    public static void main(String[] args) {

        StringBuffer str = new StringBuffer("Ruchita");
        str.append(" Toke");
        System.out.println(str);

        System.out.println(str.capacity());

        str.insert(2, "r");
        System.out.println(str);

        str.deleteCharAt(2);
        System.out.println(str);

    }
}
