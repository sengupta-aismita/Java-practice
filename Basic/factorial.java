import java.util.*;
public class factorial {
    static int Factorial(int num){
        int f = 1;
      
        for(int i = 1; i<=num; i++){
          f= f*i;
        }
        return f;
    }
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number:");
      int a = sc.nextInt();
      
      System.out.println("The factorial of the number is: " + Factorial(a));
      sc.close();
    }
}
