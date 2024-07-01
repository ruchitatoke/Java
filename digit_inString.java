import java.util.*;
public class digit_inString {
    public static void main(String[] args) {
        
        String str = "sduh285ybhd36dbjxwh3bhfg2";
        for(char ch :str.toCharArray()){
            if(Character.isDigit(ch)){
                System.out.print(ch + " ");
            }
        }
    }
}
