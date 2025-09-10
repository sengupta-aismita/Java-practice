public class Power {

    static int power(int x, int n){
        if(n == 0)
        return 1;
        return x * power(x, n-1);
    }

    static long optimizedPower(long x, long n){
        
        if(n==0)
        return 1;
        
        long halfPower = optimizedPower(x, n/2);
        if(n%2 == 0)
        return halfPower*halfPower;
        else return x*halfPower*halfPower;
    }
    public static void main(String[] args) {
        
        System.out.print(power(2,4));

    }
}
