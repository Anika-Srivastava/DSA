public class SecondLargest{
    static int secondLargest(int[] arr){
        int largest=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int v:arr){
            if(v>largest){
                second=largest;
                largest=v;
            } else if(v>second&&v!=largest){
                second=v;
            }
        }
        return second;
    }
    public static void main(String[] args){
        int[] arr={12,35,1,10,34,1};
        System.out.println(secondLargest(arr));
    }
}
