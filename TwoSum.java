import java.util.Arrays;
public class TwoSum {
    static int[] twoSumSorted(int[] arr, int target){
        int left=0, right=arr.length-1;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                return new int[]{arr[left], arr[right]};
            } else if(sum<target){
                left++;
            } else{
                right--;
            }
        }
        return new int[]{-1,-1};
    }
public static void main(String[] args) {
    int[] arr={1,3,4,6,8,11};
    System.out.println(Arrays.toString(twoSumSorted(arr,10)));
}
}
