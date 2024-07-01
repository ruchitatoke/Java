import java.util.*;

//import Student.AgeCompare;
public class comparator {
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<Student>();
        al.add(new Student(23 , "Ruchi",101));
        al.add(new Student(22 , "Shru",102));
        al.add(new Student(21 , "Sidd",103));

        System.out.println("Comparison by Age");

        Collections.sort(al, new Student.AgeCompare());
        for(Student st: al){  
            System.out.println(st.rollno+" "+st.name+" "+st.age);  
            }  


        System.out.println("Comparison by Name");
        
         Collections.sort(al,new Student.NameComparator());  
            for(Student st: al){  
              System.out.println(st.rollno+" "+st.name+" "+st.age);  
}  

    }
}
class Student{
    int age;
    String name;
    int rollno;

    Student(int age, String name, int rollno){
        this.age=age;
        this.name=name;
        this.rollno=rollno;
    }

    static class AgeCompare implements Comparator<Student>{
        public int compare(Student s1, Student s2){
            if(s1.age==s2.age)
            return 0;
            else if(s1.age>s2.age)
            return 1;
            else 
            return -1;

        }
    }
    static class NameComparator implements Comparator<Student>{  
        public int compare(Student s1,Student s2){  
        return s1.name.compareTo(s2.name);  
        }  
        }  

}