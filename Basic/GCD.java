import java.util.*;

public class GCD {

     static int greatest(int a, int b){
        int gcd=1;
          for(int i=1;i <=a && i<=b;i++){
            if(a%i == 0 && b%i ==0){
                gcd=i;
            }
          }
          return gcd;
     }
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int a = sc.nextInt();
          int b = sc.nextInt();
          System.out.println("GCD IS : "+ greatest(a,b));
          System.out.println("LCM IS: " + (a * b)/greatest(a,b));
          sc.close();
     }
}
