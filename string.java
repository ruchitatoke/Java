public class string {
    public static void main(String args[]){
        //all operations(methods) of string
        
        String name1="Ruchita";
        String name2="Rohit";
        System.out.println(name1 +" " +name2);

        System.out.println(name1.length());// for finding length of name1

        System.out.println(name2.length());// for finding length of name2

        System.out.println(name2.charAt(2));//name=Rohit and at index 2 it gives h

        System.out.println(name2.equals(name1));//as name1 != name2

        System.out.println(name1.substring(0,5));//it will print characters starting from index 0-5

        System.out.println(name1.compareTo(name2));//comparison between two strings
    }
    
}
