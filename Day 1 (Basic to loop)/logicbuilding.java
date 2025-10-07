// import java.util.*;
// public class logicbuilding {
//     public static boolean isEven(int n){
//         int rem=n%2;
//         if(rem==0){
//           return true;
//           }
//           else{
//             return false;
//           }

//     }

//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter your number : ");
//         int n=sc.nextInt();
//          if(isEven(n)==true){
//             System.out.print("even");
//          }
//          else{
//              System.out.print("odd");
//          }
  
       

//     }
    
// }
import java.util.*;

public class logicbuilding {
    public static boolean isEven(int n) {
        return n % 2 == 0; // directly return the condition
    }
      public static void printtable(int n){
        for(int i=1;i<10;++i){
            System.out.println(n+"*"+i+"="+n*i);
        }
      }
      public static int findsum(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            sum=sum+i;
        }
        return sum;
      
      }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        // System.out.println(isEven(n) ? "even" : "odd");
        // printtable(n);
         System.out.println(findsum(n));
   
    }
}
