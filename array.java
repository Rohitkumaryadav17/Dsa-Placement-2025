import java.util.*;
/// largest number 
public class array {
    public static int getlargest(int numb[]){
        int largest=Integer.MIN_VALUE; //// -infinity 
        for(int i=0;i<numb.length;i++){
            if(largest<numb[i]){
              largest=numb[i];
            }
        }
        return largest;


    }

    public static void main(String[] args) {
        int numb[]={4,56,89,99,4};
        System.out.println(getlargest(numb));
        
        
    }
    
}
