package Leetcode;

public class array1 {

    static int Search(int nums[], int target) {
        int low = 0;
        int high = nums.length - 1;
        
        while (low <= high) {
            int mid = (high + low) / 2;
            if (nums[mid] == target) {
                return mid;
            } 
            else if (nums[low] <= nums[mid])
             {
                if (target>=nums[low] && target<=nums[high]) 
                {
                    high = mid - 1;

                }
                else{
                    low = mid +1;
                }

            }
            else{
                if(target >= nums[mid +1] && target <= nums[high]){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
           
        }
        return -1;
    }

    public static void main(String args[]) {
         int arr[] = {4,5,6,7,0,1,2};
         System.out.println(Search(arr, 3));
    }
}
