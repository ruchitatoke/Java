import java.util.Scanner;

public class string_replacement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

      
        String replacement = "xyz";

        
        String result = replaceSecondWord(input, replacement);

       
        System.out.println("Modified string: " + result);

       
        scanner.close();
    }

    public static String replaceSecondWord(String input, String replacement) {
        
        String[] words = input.split(" ");

        
        if (words.length >= 2) {
            
            words[1] = replacement;
        }

        
        return String.join(" ", words);
    }
}
