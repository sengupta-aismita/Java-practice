package Arrays;

public class Kadanes {
    public static void main(String[] args) {
        
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE; // max subarray sum
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        boolean allNegative = true;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>0){
                allNegative=false;
            }
            currSum = currSum+arr[i];
            if(currSum<0){
                currSum=0;
            }
            
            maxSum = Math.max(maxSum, currSum);
        }
           
        if(allNegative){
            maxSum = arr[0];
            for (int i = 1; i < arr.length; i++) {  
                if (arr[i] > maxSum) {
                    maxSum = arr[i];  
                }
            }
        }
           
        System.out.println("Max sum is " + maxSum);
    }
}
