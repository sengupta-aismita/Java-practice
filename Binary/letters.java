//Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters

public class letters {

     public static char nextGreatestLetter(char[] letters, char target) {
           int start = 0, end = letters.length-1;
           while(start<=end){
            int mid = (start+end)/2;
              if(target<letters[mid])
              end = mid-1;
              else
              start = mid+1;
           }
           if(start<letters.length)
           return letters[start];
           else
        return letters[0];

     }
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'a';
        System.out.print(nextGreatestLetter(letters,target));
    }
}
