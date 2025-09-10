//count frequency of characters in a string
import java.util.*;
public class Frequency {


    public static void main(String[] args) {
        // code here
        String s = "aabccdee";
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch: s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        } 
        System.out.println(map);
    }
}
