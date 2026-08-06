import java.util.HashMap;
import java.util.Map;

public class CharFrequency {
    static char mostFrequent(String s){
        Map<Character, Integer> freq=new HashMap<>();
        for(char c:s.toCharArray()){
            freq.put(c,freq.getOrDefault(c,0)+1);
        }
        char result=s.charAt(0);
        int max=0;
        for(Map.Entry<Character, Integer> entry:freq.entrySet()){
            if(entry.getValue()>max){
                max=entry.getValue();
                result=entry.getKey();
            }
        }
        return result;
    }
public static void main(String[] args) {
    System.out.println(mostFrequent("mississippi"));
}
}
