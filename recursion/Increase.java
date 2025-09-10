package recursion;

import java.util.Scanner;

public class Increase {
    static void increasing(int n){
        if(n==1){
            System.out.print(n + " ");
            return;
        }
        increasing(n-1);
        System.out.print(n + " ");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        increasing(n);
        
    }
}
