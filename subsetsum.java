import java.util.Arrays;

public class subsetsum {
    public static boolean issubsetsum(int[]arr,int n,int target){
        if(n==0){
            return false;
        }
        if(target==0){
            return true;
        }
        if(arr[n-1]>target){
            return issubsetsum(arr,n-1,target);
        }
      return issubsetsum(arr, n-1, target)||issubsetsum(arr, n-1, target - arr[n-1]);
}
public static void main(String[]args){
    int[]arr={3,34,4,12,5,2};
    int target=9;
    int n=arr.length;
    boolean result=issubsetsum(arr,n,target);
    System.out.println("Subset with given sum exists:"+result);  
    }
}