import java.util.*;
class linearsearch{
    static int lnsearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return key ;
            }  

        }
        return -1;
    }
    static int binarysearch(int arr[],int key){
         int start=0, end=arr.length-1;
         while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){
             start=mid+1;

            }
            else{
                start=mid-1;
            }


         }
         return -1;


    }
    

    
    public static void main(String[] args) {
        int arr[]={7,44,9,6};
        int key=7;
       System.out.println(lnsearch(arr, 0));
       System.out.println(binarysearch(arr, key));
        
    }
}

