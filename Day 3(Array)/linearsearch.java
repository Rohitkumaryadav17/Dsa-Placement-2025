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
    public static void main(String[] args) {
        int arr[]={7,44,9,6};
        int key=7;
       System.out.println(lnsearch(arr, 0));
        
    }
}

