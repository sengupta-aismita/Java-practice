package Basic;

import java.util.*;
import static java.lang.System.*;

public class Average{

    public static int Avg(int num1,int num2,int num3){
        int avg = (num1+num2+num3)/3;
        
        return avg;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(in);
        out.println("Enter 3 numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        out.print("Average is:" + Avg(a,b,c));
        
    }
}