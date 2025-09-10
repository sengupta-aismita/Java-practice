package Sorting;

public class CountingSort {
    
    static void counting_sort(arr){
        int largest =  Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest+1];
        for(int i = 0; i<arr.length;i++){
            count[arr[i]]++;
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,4,5,1,3};
        counting_sort(arr);
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] +"");
        }
    }
}
