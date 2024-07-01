import java.util.*;
public class vowels_consonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int vcount =0;
        int ccount=0;

        str = str.toLowerCase();

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u' ){
                vcount++;
            }
            else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                ccount++;
            }
        }
        System.out.println("Vowels count is : " +vcount);
        System.out.println("Consonant count is : " +ccount);
    }
}
