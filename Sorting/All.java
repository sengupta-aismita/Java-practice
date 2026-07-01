// Wap in java to take input of an integer array
// Then press 1 to perform bubble sort and print
// Or press 2 to perform insertion sort and print
// Or press 3 to perform selection sort and print

// Time 25 min
package Sorting;

import java.util.*;

public class All {
    public static void bubble(int arr[], int n){
        int temp;
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] >arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void insertion(int arr[]){
        for(int i = 1; i < arr.length; i++) {
            int k = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > k) {
                arr[j+ 1] = arr[j];
                j--;
            }
            arr[j+ 1] = k;
        }
    }

    public static void selection(int arr[]){
          for(int i = 0; i < arr.length - 1; i++){
            int min =smallest(arr, i);
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

     public static int smallest(int arr[], int pos) {
        int min= pos;

        for(int i =pos + 1; i <arr.length; i++){
            if(arr[i] < arr[min]) {
                min = i;
            }
        }
        return min;
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

        System.out.println("\nPress \n1. Bubble Sort \n2.Insertion Sort \n3.Selection sort");
        int ch = sc.nextInt();
        switch(ch){
            case 1:
                bubble(arr, n);
                for(int i = 0; i < n; i++){
                    System.out.print(arr[i] + " ");
                }
                break;
            case 2:
                insertion(arr);
                for(int i = 0; i < n; i++){
                    System.out.print(arr[i] + " ");
                }
                break;
            case 3:
                selection(arr);
                for(int i = 0; i < n; i++){
                    System.out.print(arr[i] + " ");
                }
                break;
            default:
                System.out.println("Invalid");
        }
    }
}