public class ex {
    public static void main(String[] args) {
        String s1 = "ashish";
        String s2 = new String("ashish");
        System.out.println( s1.hashCode()==s2.hashCode());
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

              System.out.println();
              System.out.println("ANOTHER EXAMPLE");
              System.out.println();


        String s3 = "Rucha";
        String s4 = "Rucha";
        System.out.println( s3.hashCode()==s4.hashCode());
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));
        System.out.println(s3.hashCode());
        System.out.println(s3.hashCode());

    }
}
