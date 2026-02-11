import java.util.*;
public class solution {
    //// reverse of arrray ////
    public  static void reverse(int arr[]){
        int start=0, last=arr.length-1;
        while(start<last){
            // swap/////
            int temp=arr[last];
            arr[last]=arr[start];
            arr[start]=temp;
            start++;
            last--;
        }
    }
         /// print Piar of arrays// 
        public static void printpair(int arr[]){
            for(int i=0;i<arr.length;i++){
                int curr=arr[i];
                for(int  j=i+1;j<arr.length;j++){
                    System.out.print("("+curr +","+arr[j] +")");

                }
                System.out.println();
    }
}
//////// Print subarray /////////////////
  public static void subarray(int arr[]){
    for(int i=0;i<arr.length;i++){
        int start=i;
        for(int j=i;j<arr.length;j++){
            int end=j;
            for(int k=start;k<=end;k++){
                System.out.print(arr[k]+" ");

            }
            System.out.println();
        }
        System.out.println();


    }   

  }

    public static void main(String[] args) {
        int arr[]={2,4,6,7,8,99};
        reverse(arr);
        printpair(arr);
        subarray(arr);
     // Print array  
    for(int i=0;i<arr.length; i++) {
        System.out.print(arr[i]+" ");
    }
        System.out.println();

    }
}








