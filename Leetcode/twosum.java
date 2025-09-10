package Leetcode;
import java.util.*;

public class twosum {

    static int[] Two(int arr[], int key){
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length;j++){
                if((arr[i]+arr[j]) == key)
                return new int[] { i, j };
            }
        }
        return new int[] { -1, -1 }; 
    }
    public static void main(String[] args) {
       int arr[] = {3,3};
        int key = 6;

        int[] result = Two(arr, key);
        if (result[0] != -1) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
            System.out.println("Values: " + arr[result[0]] + ", " + arr[result[1]]);
        } else {
            System.out.println("No pair found.");
        }
    }
}