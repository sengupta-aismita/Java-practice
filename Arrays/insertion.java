//insertion in a sorted array
package Arrays;
public class insertion {

    static int[] sorted_array(int arr[], int elem){
        int result[]= new int[arr.length+1];
        int pos = arr.length;
        for(int i=0;i<arr.length ;i++){
            if(arr[i]>elem){
                pos = i;
                break;
            }
        }
        for(int i= 0;i<pos;i++){
            result[i] = arr[i];
        }
        result[pos] = elem;
        for(int i =pos;i< arr.length;i++){
            result[i+1] = arr[i];
        }
        return result;
    }
    public static void main(String args[]){
        int arr[] = {7,8,12,27,88};
        int elem = 10;
        int[] newArr = sorted_array(arr, elem);
        System.err.println("Updated sorted array");
        for(int i =0;i<newArr.length;i++){
            System.out.print(newArr[i] + ",");
        }
    }
}
