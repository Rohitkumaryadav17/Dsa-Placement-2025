public class binaryserarch {
    static int binary(int arr[],int key){
        int start=0; int end=arr.length-1;
            while(start<=end){
            int mid=(start+end)/2;
            // comparision 
            if(arr[mid]==key){
                return mid;

            }
            if(arr[mid]<key){
                start =mid+1;
            }
            else{
                end=mid-1;
            }

        }
        return -1;

    }
      
    public static void main(String[] args) {
        int arr[]={4,5,6,8};
        int key=6;
        int result=binary(arr,key);
        if(result!=-1){
            System.out.println("Element found at index: "+result);
        }
        else{
            System.out.println("Element not found");
        }

    }
    
}
// time complexity is O(log n)
