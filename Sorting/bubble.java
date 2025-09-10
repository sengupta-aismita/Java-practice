package Sorting;

public class bubble {
    static void BubbleSort(int[]arr, int n){
        int temp;
        for(int i = 0; i<n-1;i++){
            for(int j = 0; j< n-i-1; j++){

                if(arr[j]>arr[j+1]){
                  temp = arr[j];
                  arr[j] = arr[j+1];
                  arr[j] = temp;
                }
            }
        }
        return;
    }
       
    public static void main(String[] args) {
        int arr[] = {5,3,4,2,1};
        int n = arr.length;
        BubbleSort(arr,n);
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+"");
        }
    }
    
}
