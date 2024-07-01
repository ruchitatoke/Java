import java.util.*;
public class Reverse_string {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String nstr="";
        char ch;
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            nstr=ch+nstr;
            
        }
        System.out.println(nstr);
    }
}
