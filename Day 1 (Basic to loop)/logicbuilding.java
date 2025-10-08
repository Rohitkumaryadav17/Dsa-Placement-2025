import java.util.*;

public class logicbuilding {

     ////print even or odd number
    
    public static boolean isEven(int n) {
        return n % 2 == 0; // directly return the condition
    }

        /// print table of any number
      
      public static void printtable(int n){
        for(int i=1;i<10;++i){
            System.out.println(n+"*"+i+"="+n*i);
        }
      }

      /// find sum of n natural number
    
      public static int findsum(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            sum=sum+i;
        }
        return sum;
      
      }
      public static int sumofsquarenaturalno(int n){
         int sum=0;
      for(int i=0;i<n+1;i++){
        sum=i*i+sum;
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
         System.out.println(sumofsquarenaturalno(n));
   
    }
}
