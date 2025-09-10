import java.util.Scanner;

public class bincoeff {
    static int Factorial(int num){
        int f = 1;
      
        for(int i = 1; i<=num; i++){
          f= f*i;
        }
        return f;
    }

    static int Binomial(int num1, int num2){
        int n_fact = Factorial(num1);
        int r_fact = Factorial(num2);
        int minus =  Factorial(num1-num2);
        int bin = n_fact/(r_fact*minus);
        return bin;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number:");
      int a = sc.nextInt();
      System.out.println("Enter another number:");
      int b = sc.nextInt();
      System.out.println("The binomial Coefficient is : " + Binomial(a,b));
      sc.close();
    }
}
