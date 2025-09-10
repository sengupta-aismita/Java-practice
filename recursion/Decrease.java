//print numbers from 1 to n in decreasing order
import java.util.*;

public class Decrease {

    static void decreasing(int n){
        if(n==1){
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        decreasing(n-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        decreasing(n);
        
    }
}
