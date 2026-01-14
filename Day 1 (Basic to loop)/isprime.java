import java.util.*;
public class isprime {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.err.println("enter number : ");

        int n=sc.nextInt();
        if(n==2){
            System.out.println("prime ");
        }
       
            else{
                
                 boolean isprime=true;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                isprime=false;

            }
        }
        if(isprime==true){
            System.out.println("n is prime ");
        }
        else{
            System.out.println("not prime");
        }
            }



    }
    
}
