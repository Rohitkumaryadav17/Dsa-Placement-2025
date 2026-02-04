public class largest {
    public static int getlargest(int arr[]){
        int large=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>large){
                large=arr[i];


            }
        }
        return large;


    }
    public static void main(String[] args) {
        int  arr[]={2,9,4,8,5};
        System.out.println("largest value has : "+getlargest(arr));
        
    }
    
}
