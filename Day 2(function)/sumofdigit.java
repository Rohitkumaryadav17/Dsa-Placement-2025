public class sumofdigit {
    public static int Sumofdigit(int n){
        int  sumofdigit=0;
        while(n>0){
            int lastdigit=n%10;
            sumofdigit=sumofdigit+lastdigit;
            n=n/10;
        }
        return sumofdigit;
    }
 
    public static void main(String[]args){
        int n=345;
        System.out.print(Sumofdigit(n));
 

    



    }
    
}
