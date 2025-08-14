
import java.util.Scanner;

public class avearge3no {
    public static int Avg(int a,int b,int c){
        
        
        return (a+b+c)/3;
     


    }


    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number :");
        int a=sc.nextInt();
        System.out.print("Enter the second number :");
        int b=sc.nextInt();
        System.out.print("Enter the  third number : ");
        int c=sc.nextInt();
        System.out.print("Averge of given number : "+Avg(a, b, c));
       

    }
    
}
