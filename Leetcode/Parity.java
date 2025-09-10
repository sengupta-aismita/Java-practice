package Leetcode;

public class Parity {

    static boolean isArraySpecial(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++)
         {
            if ((nums[i] % 2 == 0 && nums[i + 1] % 2 == 0) || (nums[i] % 2 != 0 && nums[i + 1] % 2 != 0)) 
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 4 };
        System.out.println(isArraySpecial(arr));
    }
}