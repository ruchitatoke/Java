public class rotate_string {
    public static void main(String[] args) {
        String str = "Ruchita";
        System.out.println(rotate(str, 2));

    }
    static String rotate(String str, int d){
        String ans = str.substring(d) + str.substring(0,d);
        return ans;
    }
}
