import java.util.*;
public class palidrome {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number forchecking palidrome:");
        int a=sc.nextInt();
        int reverse=0;
        int original=a;
        while(a!=0){
            int digit=a%10;
            reverse=reverse*10+digit;
            a/=10;



        }
        if(original==reverse){
            System.out.print("this is palidrome");

        }
        else{
            System.out.print("Not palidrome");
        }




    }
}

