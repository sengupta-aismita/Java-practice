public class pangram {

    public static boolean checkPangram(String str){
         int n = str.length();
         if(n<26)
         return false;

         boolean visited[] = new boolean[26];
         for(int i = 0; i < n; i++){
            char x = str.charAt(i);
            if(x >= 'a' && x <= 'z')
            visited[x - 'a'] = true;
            if(x >= 'A' && x<= 'Z')
            visited[x - 'A'] = true;
         }
         for(int i = 0; i < 26; i++){
            if(visited[i] == false)
            return false;
         }
         return true;
        }


    public static void main(String[] args) {
        System.out.println(checkPangram("The quick brown fox jumps over the lazy dog"));
    }
}
