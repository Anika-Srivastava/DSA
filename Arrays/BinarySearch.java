public class BinarySearch {
    static int binarySearch(int[] arr, int target){
        int lo=0, hi=arr.length-1;
        while(lo<=hi){
            int mid=lo+(hi-lo) /2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]<target) lo=mid+1;
            else hi=mid-1;
        }
        return -1;
    }
public static void main(String[] args) {
    int[] arr={2,5,8,12,16,23,38,56,72,91};
    System.out.println(binarySearch(arr,23));
}
}
 