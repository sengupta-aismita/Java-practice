package Sorting;

public class selection {

    static void selection_sort(int[] arr){
        int n = arr.length;
        int temp;
        int minIndex = -1;
        for(int i = 0; i<n-1;i++){
            minIndex = i;
            for(int j=i; j<n;j++){
                if(arr[minIndex]> arr[j]){
                    minIndex = j;
                }
            }
            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,5,1,3};
        selection_sort(arr);
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] +"");
        }
    }
}
