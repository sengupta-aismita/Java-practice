public class SumDigits {
    public static int Sum(int num){
        //int copy = num;
        int s = 0;
        while(num>0){
            int last = num%10;
            s = s + last;
            num = num/10;
        }
        return s;
    }
    public static void main(String[] args) {
        System.out.print(Sum(52));
    }
}
