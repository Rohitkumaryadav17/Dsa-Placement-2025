import java.util.*;
// linear search 
class searching{
     public static int linear(int arr[], int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){

    return i;
            }
        
        }
        return -1;

     }
     ////  Binaray search
      public static int binarysearch(int arr[],int key){

        int start=0; int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/ 2;
            if(arr[mid]==key){
                return mid;


            }
            if(arr[mid]<key){
                start=mid+1;

            }
            if(arr[mid]>key){
                end=mid-1;
                return mid;
            }

        }
        return -1;


         
      }
    public static void main(String[] args) {
        int arr[]={1,4,56,8};
        int key=56;
        int index=linear(arr, key);
        if(index==-1){
            System.out.println("not found");

        }   
        else{
            System.out.println("key at index :"+index);
        } 
        System.out.println("index for key : "+binarysearch(arr, key));
        
    }
}

