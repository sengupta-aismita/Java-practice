package Leetcode;

public class buystocks {

    static int Buy(int nums[]){
        int bp = Integer.MAX_VALUE;
        int max_profit = 0;
        for(int i = 0;i<nums.length;i++){
               if(nums[i]<bp)
               bp = nums[i];
               int profit = nums[i] - bp; 
               if(profit>max_profit)
               max_profit = profit;  
        }
        return max_profit;
    }
    public static void main(String[] args) {
        int nums[] = {7,6,4,3,1};
        System.out.println(Buy(nums));
    }
} 
