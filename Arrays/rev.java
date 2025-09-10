package Arrays;
import java.util.*;

public class rev {
    static void Reverse(int arr[]){
        for(int i = 0; i<arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - i -1];
            arr[arr.length - i - 1] = temp;
        }
        System.out.println("Reversed array : ");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        System.out.println("Enter the elements : ");
        int arr [] = new int [n];
        for(int i =0;i<n; i++){
            arr[i] = sc.nextInt();
        }
        Reverse(arr);
    }
}
