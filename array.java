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
    /// smallest number 
     static int smallest(int numb[]){
        int small=Integer.MAX_VALUE;
        for(int i=0;i<numb.length;i++){
            if(small>numb[i]){
                small=numb[i];


            }
            

        }
        return small;


     }
     
    

    public static void main(String[] args) {
        int numb[]={4,56,89,99,1};
        System.out.println(getlargest(numb));
        System.out.println(smallest(numb));
        
        
    }
    
}
// time complexity O(n)
