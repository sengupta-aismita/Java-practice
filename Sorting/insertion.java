package Sorting;

public class insertion {

    static void insertion_sort(int arr[]){
        for(int i = 1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            //correct position to insert
            while(prev>=0 && arr[prev]> curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = curr;
        }
    }
     public static void main(String[] args) {
        int arr[] = {2,4,5,1,3};
        insertion_sort(arr);
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] +"");
        }
    }
}
