import java.util.*;
public class anagram {
    public static void main(String[] args) {
        
        String str1 = "Ruchi";
        String str2 = "Chiru";

        str1 =str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() != str2.length()){
            System.out.println("Not an anagram");
        }
        else{
            char[] sstr1 = str1.toCharArray();
            char[] sstr2 = str2.toCharArray();

            Arrays.sort(sstr1);
            Arrays.sort(sstr2);

            if(Arrays.equals(sstr1, sstr2)==true){
                System.out.println("Anagram");
            }
            else{
                System.out.println("Not an anagram");
            }
        }

    }
}
