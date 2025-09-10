package Arrays;

public class prefix {
    public static void main(String[] args) {
        
        int s = 0;
        int maxSum = Integer.MIN_VALUE; // max subarray sum
        int arr[] = {2,4,6,8,10};
        int prefix[] = new int [arr.length];
        prefix[0] = arr[0];
        for(int i = 0; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        for(int i = 0; i<arr.length; i++){
            for(int j = i; j< arr.length; j++){
                s = i ==0? prefix[j]:  prefix[j] - prefix[i-1];

                if(maxSum< s){
                    maxSum = s;
                }
            }
        }
        System.out.println("Max sum is " + maxSum);
    }
}
