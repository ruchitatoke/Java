import java.util.Scanner;
public class sum {
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
//System.out.println("Enter the n number: ");
int count=0;
int sum=0;

while(count<=n){
    System.out.println("Enter the " +count+  " number");
    int c=sc.nextInt();
    sum+=c;
    count++;
System.out.println(sum);
}
    }
}
