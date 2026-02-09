// Wap in java to identify one command line integer argument is Armstrong or not

public class Armstrong{

    public void calculate(int num){
        int copy = num, sum = 0, count = 0;
        while(copy != 0){
            count++;
            copy /= 10;
        }
        copy = num;
         while (copy != 0) {
            int digit = copy % 10;
            sum += (int)Math.pow(digit, count);
            copy /= 10;
        }
        if (sum == num) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
    }


    
    public static void main(String args[]){
        Armstrong a = new Armstrong();
        a.calculate(Integer.parseInt(args[0]));
    }
}