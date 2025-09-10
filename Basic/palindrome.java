public class palindrome {

    public static boolean Palindrome(int num){
      int copy = num;
      int rev = 0;
      while(copy!=0){
        int lastDigit = copy%10;
         rev = rev*10 + lastDigit;
        copy = copy/10;
      }
      if(rev == num){
        return true;
      }
      return false;
    }
    public static void main(String[] args) {
        System.out.println(Palindrome(123));
    }
}
