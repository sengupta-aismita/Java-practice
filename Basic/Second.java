// Wap in java to identify second largest element from some command line integer argument 
// Without using any loop

public class Second{

    public void sec(String arr[]){
        int max = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
         for (int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(arr[i]);
            if (num > max) {
                second = max;
                max = num;
            } else if (num > second && num != max) {
                second = num;
            }
        }
        System.out.println("Second largest in array is :" + second);
    }
    public static void main(String[] args) {
        Second s = new Second();
        s.sec(args);
    }
}