import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
    static char firstNonRepeating(String s){
        Map<Character , Integer> count=new LinkedHashMap<>();
        for(char c:s.toCharArray()){
            count.put(c,count.getOrDefault(c,0)+1);
        }
        for(char c:s.toCharArray()){
            if(count.get(c)==1) return c;
        }
        return '\0';
    }
public static void main(String[] args) {
    System.out.println(firstNonRepeating("swiss"));
}
}
