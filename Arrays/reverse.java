package Arrays;

public class reverse {

    static void Rev(int arr[]){
        int first = 0;
        int last = arr.length -1;
        while(first<last){
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;

            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,3,8,9,7};
        Rev(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
    }
}
