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

      ////// swapp ot two number
      ///  
      public static void swappoftwonum(int a,int b){
           int temp=a;
           a=b;
          b=temp;
                System.out.print("After swapping: a = " + a + ", b = " + b);
          }
          /// opposite of dice 
          public static int  oppositeofdice(int n){
            int ans;

            if(n==6){
              ans =1;
          }
          else if(n==2){
             ans =5;
          }
          else if(n==3){
          ans =5;

          }
          else if(n==4){
            ans =3;

          }
          else if(n==5){
             ans =2;
          }
          else {
            ans= 1;
          }
          return ans;
           
          }
          /// nth term of ap
           
          public static int nthtermAp(int a1,int a2,int n){
            int d=a2-a1;
            int nthterm=a1+(n-1)*d;

            return nthterm;
          }
          

       
            

          
      
   
      


    public static void main(String[] args) {
      int arr[]={1,2,3,4,5};
        // Scanner sc = new Scanner(System.in);

   
          // System.out.print(oppositeofdice(n));
        //       System.out.print("Enter first term (a1): ");
        // int a1 = sc.nextInt();

        // System.out.print("Enter second term (a2): ");
        // int a2 = sc.nextInt();

        // System.out.print("Enter which term you want (n): ");
        // int n = sc.nextInt();

        // int result = nthtermAp(a1, a2, n);
        // System.out.println("The " + n + "th term of the AP is: " + result);


        // int a = sc.nextInt();
          //  System.out.print("Enter your number b: ");
          //  int b=sc.nextInt();
          // swappoftwonum(a,b);
       

        
        // System.out.println(isEven(n) ? "even" : "odd");
        // printtable(n);
        //  System.out.println(findsum(n));
        //  System.out.println(sumofsquarenaturalno(n));

   
    }
}
