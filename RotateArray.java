import java.util.Arrays;
public class RotateArray {
    static void rotateRight(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
    }
static void reverse(int[] arr,int lo, int hi){
    while(lo<hi){
        int t=arr[lo]; arr[lo]=arr[hi]; arr[hi]=t;
        lo++; hi--;
    }
}
public static void main(String[] args){
    int[] arr={1,2,3,4,5,6,7};
    rotateRight(arr,3);
    System.out.println(Arrays.toString(arr));
}
}
