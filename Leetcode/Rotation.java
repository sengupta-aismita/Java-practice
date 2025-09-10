package Leetcode;

public class Rotation {
    public static boolean check(int[] nums){
        int count = 0;
        if (nums.length == 1) {
            return true;
        }
        for(int i =0; i< nums.length -1; i++){
            
            if(nums[i]>nums[i+1] ){
                count++;
            }
        }
            if(nums[nums.length -1]>nums[0]){
                count++;
            }
            if(count<=1){
                return true;
            }
        
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3};
        System.out.println(check(arr));
    }
}
