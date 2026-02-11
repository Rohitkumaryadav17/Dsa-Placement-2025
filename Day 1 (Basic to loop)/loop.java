import java.util.*;
public class loop{
    public static void printnum(int n){
        /// using while  loop 
         int counter=1;
          while(counter<=10){
            System.out.print(counter+" ");
            counter++;
          }
          System.out.println();

        // for loop  

        for(int i=1;i<=10;i++){
            System.out.print(i+" " );
        }

    }
    public static void sumnatural(int n){
      
        int sum=0;
        int i=1;
        while(i<=n){
            sum+=i;  // sum=sum+i;
            i++;

        }
          System.out.println(sum);
    
    }
    public static void squarepattern(int n){
        for(int i=1;i<=4;i++){
        System.out.println("****");
              
        }
    }
    public static void reversenum(int n){
        int a=9869;
        while(a>0){
            int lastdigit=n%10;
            System.out.println(lastdigit+ " ");
            a=a/10;
        }

        System.out.println();

    }
    public static void checkprime(int n){
        if(n==2){
            System.out.println( " n is prime");
        }
        else{
                boolean isprime=true;
        for(int i=2;i<n-1;i++){
            if(n%i==0){
                isprime=false;
            }
            if(isprime==true){
                System.out.println("n is prime number");
            }
            else{
                System.out.println("n is not prime number");
            }

        }
    



            
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.print("enter your number : ");
         int n=sc.nextInt();
        // printnum(0);
        // sumnatural(n);
        // squarepattern(n);
        // reversenum(n); 
        checkprime(n);
    }
    
}
 

