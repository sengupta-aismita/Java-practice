package Arrays;

public class Subarrays {
    public static void main(String[] args) {
        int ts=0;
        int s = 0;
        int maxSum = Integer.MIN_VALUE; // max subarray sum
        int arr[] = {2,4,6,8,10};
        for(int i = 0; i<arr.length; i++){
            for(int j = i; j< arr.length; j++){
                for(int k = i; k<= j; k++){
                    System.out.print(arr[k] + " ");
                    s = s + arr[k]; //Sum of subarrays
                    System.out.println();
                }
                System.out.println("Sum = " + s);
                if(maxSum< s){ //maxsubarray
                    maxSum = s;
                }
                ts++;
                s=0; // Initializing back to 0
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total pairs = " + ts);
        System.out.println("Maximum sum : " + maxSum);
    }
}
