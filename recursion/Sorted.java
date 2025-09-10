//check if an array is sorted
import java.util.*;
public class Sorted{

    static boolean is_Sorted(int arr[], int i){
        if(i == arr.length-1 )
        return true;
        if(arr[i] > arr[i+1])
        return false;

        return is_Sorted(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,4};
        System.out.print(is_Sorted(arr, 0));
    }
}
