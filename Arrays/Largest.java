package Arrays;


public class Largest {
    static int Lar(int arr[]){
        int val= Integer.MIN_VALUE; //-infinity
        int small = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(val <arr[i]){
               val = arr[i];
            }
            if(small> arr[i]){
               small= arr[i];
            }
        }
        System.out.println("Smallest is :" + small);
      return val;
      
    }
    public static void main(String[] args) {
        int arr[] = {2,3,8,9,7};
        System.out.println("the largest element in the array is : "+ Lar(arr));
    }
}
