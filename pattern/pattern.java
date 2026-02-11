public class pattern{
    public static void square(int n){
        for(int i=1;i<=10;i++){
            // one line inner loop
           for(int j=1;j<=i;j++){
            System.out.print("*");
           }
           System.out.println();
        }
    }
    public static void invertedstar(int n){
        int a=4;
    for(int line=1;line<=a;line++){
        for(int star=1;star<=a-line+1;star++){
            System.out.print("*");
        }
    System.out.println();

    }



    }
    public static void main(String[] args) {
        // square(0);
        invertedstar(0);

        
    }
     
}
