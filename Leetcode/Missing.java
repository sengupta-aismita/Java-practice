//missing in a range from 0 to n

import java.util.Arrays;
import java.util.List;

public class Missing {

    //my solution
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != j)
            break;
            j++;
        }
       return j; 
    }

    //Ap sum solution
    public int missingNumber2(int[] nums) {
        int n = nums.length;
        int expected = (n*(n+1))/2;
        int actual = 0;
        for(int i = 0 ; i < nums.length; i++ ){
            actual += nums[i];
        }

        return expected - actual;
}

    //xor solution
     public int missingNumber3(int[] nums) {
        int xor = 0;
        for(int i = 0 ; i < nums.length; i++ ){
            xor ^= i;
        }
        for(int i = 0 ; i < nums.length; i++ ){
            xor ^= nums[i];
        }

        return xor;
}

}
