package Leetcode;

public class running {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4};
        int result[];
        result[0]= arr[0];
        for(int i=0;i<arr.length;i++){
            result[i] = arr[i] + result[i-1];
        }
      return result;
    }
}
