import java.util.Scanner;
public class average {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int count=1;
        int sum=0;
        System.out.println("Enter the n number: "+n);
        while(count<=n)
        {
        System.out.println("Enter the"+count+"number");
        int c=sc.nextInt();
        sum+=c;
        count++;
        }
        int average=sum/n;
        System.out.println(average);
    }
}
