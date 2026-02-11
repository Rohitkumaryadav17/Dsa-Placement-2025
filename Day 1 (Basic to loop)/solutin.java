import java.util.*;
public class solutin {
     public static void positiveneg(int n){
        if(n>0){
            System.out.println("positive number");
        }
        else{
            System.out.println("negtive");
        }

     }
     /// days number 
      public static void dayweekname(int day){
        switch(day){
            case 1:
                System.out.println("monday");
                break;
                case 2:
                    System.out.println("tuesday");
                    break;
                    case 3: 
                    System.out.println("wednesday");
                    break;
                    case 4:
                        System.out.println("thursday");
                        break;
                    case 5: 
                    System.out.println("friday");
                    break;
                    case 6:
                        System.out.println("saturday");
                        break;
                    case 7:
                        System.out.println("sunday");
                        break;
                 default:
                    System.out.println("invalid number");
        }

      }
      
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number :");
        int day=sc.nextInt();
        dayweekname(day);
        // int n=sc.nextInt();
        // positiveneg(n);
        
        
    }

    
}
