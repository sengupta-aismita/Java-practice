class A {
    int a, b;

    void init(int x, int y) {
        a = x;
        b = y;
    }
    int gcd() {
        int x = a;
        int y = b;
        int gcd = 1;

        for (int i = 1; i <= x && i <= y; i++) {
            if (x % i == 0 && y % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
    int lcm() {
        int x = a;
        int y = b;
        int gcdVal = gcd(); 
        return (x * y) / gcdVal;
    }
}

public class Demo {
    public static void main(String[] args) {
        A obj = new A();
        obj.init(12, 18);
        int g = obj.gcd();
        int l = obj.lcm();
        System.out.println("GCD = " + g);
        System.out.println("LCM = " + l);
    }
}
