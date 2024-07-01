public class string {
    public static void main(String args[]){
        //all operations(methods) of string
        
        String name1="Ruchita";
        String name2="Toke";
        System.out.println(name1 +" " +name2);
    
        System.out.println(name1.codePointAt(2));

        System.out.println(name1.length());// for finding length of name1

        System.out.println(name2.length());// for finding length of name2

        System.out.println(name2.charAt(2));//name=Toke and at index 2 it gives k

        System.out.println(name2.equals(name1));//as name1 != name2

        System.out.println(name1.substring(0,5));//it will print characters starting from index 0-5

        System.out.println(name1.compareTo(name2));//comparison between two strings

        System.out.println(name1.concat(name2));

        StringBuffer sb = new StringBuffer("Ruchi");
        sb.append("ta");
        System.out.println(sb.append(name2));
        
        StringBuilder s1 = new StringBuilder();
        s1.append("Ruchita").append("Manish Toke");
        System.out.println(s1);
        
        String s2 = new String();
        System.out.println(s2.concat("Ruchita").concat("Toke"));


    
    }
    
}
