import java.util.*;
public class comparable {
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<Student>();
        al.add(new Student(101, "Ruchita", 21));
        al.add(new Student(102, "Shrutika", 23));
        al.add(new Student(103, "Shreysha", 20));

        Collections.sort(al);
        for(Student st : al){
            System.out.println(st.name+" " +st.rollno +" " +st.age);
            
        }

    }
}
class Student implements Comparable<Student>{
     int rollno;
     String name;
     int age;

     Student(int rollno, String name, int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
     }

     public int compareTo(Student st){
        if(age == st.age)
        return 0;
        else if(age>st.age)
        return 1;
        else
        return -1;
       }
}