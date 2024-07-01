public class prime_number {
    public static void main(String[] args) {
        int num=5;
        boolean ans=false;
        for(int i=2; i<=num/2 ;i++){
            if(num%i==0){
                 ans=true;
                break;
            }

        }
        if(!ans){
            System.out.println("not prime");
        
        }else{
            System.out.println("prime");
        }
    }
}
