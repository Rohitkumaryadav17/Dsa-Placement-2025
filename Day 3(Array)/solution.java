public class solution{
    public static int Getlargest(int arr[]){
      int max=arr[0];
        for(int i=1;i<max;i++){
        if(arr[i]>max){

            arr[i]=max;

        
        }

    }
    return max;
    }
      
    public static void main(String[] args) {
        int arr[]={1,4,5,9,99};
         System.out.println(Getlargest(arr));
        
    }
    
}
