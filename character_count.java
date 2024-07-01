public class character_count {
    public static void main(String[] args) {
        
        String str = "Ruchita";
        int count=0;
        for(int i= 0; i<str.length(); i++){
            if(str.charAt(i) != ' ')
            count++;
        }
        System.out.println("The count of the character is : " +count);
        System.out.println(str.length());
    }
}
