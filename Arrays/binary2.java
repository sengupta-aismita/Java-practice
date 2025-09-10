package Arrays;

public class binary2 {

    static int BSearch(int arr[], int num){
        int start=0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start + end)/2;
            if(num == arr[mid])
            return mid;
            else if(num<arr[mid])
            end = mid-1;
            else if(num>arr[mid])
            start = mid+1;
        }
        return -1;
    }
    public static void main(String args[]){
         int arr[] = {2,3,8,9,7};
        int num = 8;
        System.out.println("element is in : "+  BSearch(arr, num));
    }
}
