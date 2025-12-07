package Arrays;
import java.util.*;

public class largest2 {
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int n = sc.nextInt();
        System.out.println("Enter elements in the array : ");
        int arr[] = new int [n];
        for(int i = 0;i < n; i++){
               arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for(int i= 0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("The largest element in the array is : "+ max);
         sc.close();
     }
    
}
