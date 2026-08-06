import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesChar {
    static String removeDuplicates(String s){
        StringBuilder sb=new StringBuilder();
        Set<Character> seen=new LinkedHashSet<>();
        for(char c:s.toCharArray()){
            if(seen.add(c)){
                sb.append(c);
            }
        }
        return sb.toString();
    }
public static void main(String[] args) {
    System.out.println(removeDuplicates("programming"));
}
}
