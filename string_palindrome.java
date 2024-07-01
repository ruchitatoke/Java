public class string_palindrome {
    public static void main(String[] args) {
        String str="abcdcba";
        System.out.println(palindrome(str));
    }
    public static boolean palindrome(String str){
        if(str.length()==0 || str==null){
            return true;
        }
        str=str.toLowerCase();
        for(int i=0;i<str.length()/2;i++){
            char start=str.charAt(i);
            char end=str.charAt(str.length()-1-i);
            if(start != end){
                return false; 
            }
        }
         return true;
    }
   
}
