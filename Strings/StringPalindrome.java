public class StringPalindrome {
    static boolean isPalindrome(String s){
        String clean=s.toLowerCase().replaceAll("[^a-z0-9]","");
        int left=0, right=clean.length()-1;
        while(left<right){
            if(clean.charAt(left)!=clean.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args){
        String s="A man a plan a canal panama";
        System.out.println(isPalindrome(s));
    }
}
