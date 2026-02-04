 import java.util.*;
 public class sqrt{
    public int mysqrt(int x){
          
        if(x==0){
            return 0;
        }
        int start=1,end=x, ans=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<=x/mid){
                ans=mid;
                start=mid+1;

            }
            else{
                end=mid-1;
            }
        }
     
    return ans;

    }
       public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println("squARE ROOOT : "+mysqrt);
         
          }

}