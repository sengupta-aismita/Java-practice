package Leetcode;

public class array2 {
    
        public static int findDuplicate(int[] nums) {
            for(int i= 0; i<nums.length-1; i++){
                for(int j = i+1;  j<nums.length; j++){
                    if(nums[i] == nums[j]){
                        return nums[i];
                    }
                }
            }
            return -1;
        }

        public static void main(String[] args) {
            int arr[] = {3,1,3,4,2};
            System.out.println("Duplicate number: " + findDuplicate(arr));
        }
    }

