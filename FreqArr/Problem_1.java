// Input: an array nums of size n with values in [1, n]
// Output: list of all elements that appear 2 or more times

// Example:

// nums = [4,3,2,7,8,2,3,1]
// Output = [2, 3]

import java.util.ArrayList;

public class Problem_1 {
  public static void main(String[] args){
      int nums[] = {4,3,2,7,8,2,3,1};
      ArrayList<Integer> result = new ArrayList<>();
      int i, count = 1;
      int freq[] = new int[nums.length];
      for(i = 0; i < nums.length; i++){
           int x = nums[i];
           freq[x - 1]++;
      }
      for(i = 0; i < freq.length; i++){
        if(freq[i] >= 2){
            result.add(i + 1);
        }
      }
  }
}
