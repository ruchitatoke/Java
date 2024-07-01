import java.util.StringTokenizer;

public class string_tokenizer {
    public static void main(String[] args) {
        
        StringTokenizer str = new StringTokenizer("My name is Ruchita");
        while(str.hasMoreTokens()){
            System.out.println(str.nextToken());
        }
    }
}
