public class Extra {

    //my method
    public static char extraChar(String a, String b){
        int n = a.length();
        int l = b.length();
        if(n<=l)
        return '\0';
        int freq[] = new int[26];
        for(int i = 0; i < n; i++){
            char x = Character.toLowerCase(a.charAt(i));
            freq[x - 'a']++;
        }
        for(int i = 0; i < l; i++){
            char ch = Character.toLowerCase(b.charAt(i));
            freq[ch - 'a']--;
        }

        for(int i = 0; i < 26; i++){
            if(freq[i] > 0)
            return (char)(i+'a');
        }
      return '\0';
    }
    //gfg method
    public static char extra(String a, String b){
        int res = 0;
        int n = a.length();
        for(int i = 0; i < n; i++){
            res ^= a.charAt(i) ^ b.charAt(i);
        }
        res ^= b.charAt(n);
        return (char)(res);

    }

    public static void main(String[] args) {
        
    }
}
