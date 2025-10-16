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
     /// Reverse of array 
      public static void reverse(int numb[]){
          int start=0; int end=numb.length-1;
          while(start<end){
            // swappp
            int temp=numb[start];
            numb[start]=numb[end];
            numb[end]=temp;
            start++;
            end--;

          }
 /// print reverse array 

  for(int i=0;i<numb.length;i++){
    System.out.println(numb[i]+"");
  }
System.out.println();

    }
     
  

    public static void main(String[] args) {
        int numb[]={4,5,45,35,1};
        // System.out.println(getlargest(numb));
        // System.out.println(smallest(numb));
         reverse(numb);

        
        
        
    }
    
}
// time complexity O(n)
