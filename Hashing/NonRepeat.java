//retur first non repeating character
import java.util.HashMap;

public class NonRepeat {

    static int NonRepeating(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for(char ch: s.toCharArray()){
            if(map.get(ch) == 1)
            return s.indexOf(ch);

        }
        return -1;
    }
    public static void main(String[] args){
        String s = "leetcode";
        System.out.print(NonRepeating(s));
    }
}
