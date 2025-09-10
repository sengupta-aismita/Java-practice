package Sorting;

public class selection1 {

    static void selection_sort(int arr[]){
        
         for(int i = 0; i< arr.length - 2; i++){ // turns
            int min = i;
                for(int j = i+1; j<arr.length; j++){ // unsorted array start
                    if(arr[min]>arr[j])
                    min = j;

                }
          int temp = arr[min];
          arr[min]= arr[i];
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
