//binary strings are those which cannot have consecutive same numbers
//consecutive 1s
//base case 0
// nth place choice if n = 0 then f(n-1)
//use lastPlace to track last place has 0 or 1...then dont allow consecutive 1s
public class Binary {

    public static void binaryStrings(int n, int lastPlace, String str){
         if(n==0){
            System.out.println(str);
            return;
         }

         binaryStrings(n-1, 0, str+"0");
         if(lastPlace == 0){
            binaryStrings(n-1, 1, str+"1");
         }

    }
    public static void main(String[] args) {
        binaryStrings(3, 0, "");
    }
}
