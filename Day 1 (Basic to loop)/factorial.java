public class factorial {
    public static int fact(int n){
      if(n==1){
            return 1;
        }
        int a = n*fact(n-1);
        return a;
    }
    
    public static void main(String[]args){
        System.out.println(fact(12));

    }
    
}
