//More optimized for larger numbers
import java.util.*;
public class Prime_main {
    
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         int num = sc.nextInt();
         if(num == 1)
         System.out.println("not a prime number");
         if(num==2 || num==3)
         System.out.println("prime number");
         if(num%2==0 || num%3==0)
         System.out.println("Not a prime number");
         for(int i = 5;i<=Math.sqrt(num);i = i+6){
            if(num%i == 0 || (num%(i+2)==0))
            System.out.println("not a prime number");
         }
        System.out.println("prime number");
        sc.close();
    }
}
