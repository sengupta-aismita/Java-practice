// Wap to take input of an integer array
// Then take input of an item

// Press 1 to find the location of item by using linear search
// Or press 2 to find the location of item by using binary search

// Or press 3 to find the location of item by using interpolation search

package Arrays;
import java.util.*;
public class All{

    public static int linear(int arr[] , int item){
          for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                return i; // position
            }
        }
        return -1;
    }

    public static int binary(int arr[], int item){
         int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == item) {
                return mid;
            } else if (arr[mid] < item) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
    public static int interpolation(int arr[], int key){
        int lo = 0, hi = arr.length -1;
        while(lo<=hi){
            int mid = lo + ((key-arr[lo])*(hi-lo))/(arr[hi]-arr[lo]);
            if(arr[mid]==key)
                 return mid;
            else if(arr[mid]>key) hi = mid-1;
            else lo = mid+1;
        }
        return -1;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter elemeents : ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

         System.out.print("Enter item to search: ");
        int item = sc.nextInt();

        System.out.println("\nPress \n1. Linear Search\\n2. Binary Search\\n3. Interpolation Search");
        int ch = sc.nextInt();

         int result = -1;
        switch(ch){
             case 1:
                result = linear(arr, item);
                break;

            case 2:
                Arrays.sort(arr);
                result = binary(arr, item);
                break;

            case 3:
                Arrays.sort(arr);
                result = interpolation(arr, item);
                break;

            default:
                System.out.println("Invalid choice");
        }
        if(result != -1){
            System.out.println("Item found at index: " + result);
        } else {
            System.out.println("Item not found");
        }
    }
    
}
