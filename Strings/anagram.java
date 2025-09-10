import java.util.Arrays;
import java.util.HashMap;

public class Anagram {

    //naive solution O(nlogn)
    static boolean Anagram(String s, String str) {
        s = s.toLowerCase();
        str = str.toLowerCase();

        if (s.length() == str.length()) {
            char[] s_array = s.toCharArray();
            char[] str_array = str.toCharArray();

            Arrays.sort(s_array);
            Arrays.sort(str_array);

            boolean result = Arrays.equals(s_array, str_array);
            if (result) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    // another method O(n)
    static boolean Anagram2(String s, String str) {
        if (s.length() != str.length())
            return false;

        int freq[] = new int[26];
        for (int i = 0; i < s.length; i++) {
            char x = Character.toLowerCase(s.charAt(i));
            freq[x - 'a']++;
            char ch = Character.toLowerCase(str.charAt(i));
            freq[ch - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0)
                return false;
        }

        return true;
    }


     static boolean Anagram3(String s, String str) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            int freq = map.getOrDefault(c, 0 ) + 1;
            map.put(c, freq );
        }
        for(char ch : str.toCharArray()){
             if(map.get(ch) != null){
                if(map.get(ch) == 1)
                map.remove(ch);
                else
                map.put(ch,map.get(ch) - 1);
             }
             else
             return false;
        }
        return map.isEmpty();
     }



    public static void main(String[] args) {
        // code here
        String s = "race";
        String str = "care";
        System.out.println(Anagram(s, str));
    }
}
