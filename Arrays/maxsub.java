
package Arrays;

public class maxsub {
    static void Sub(int arr[]){
        int sum=0,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int i = 0; i<arr.length; i++){
            for(int j = i; j<arr.length; j++){
                for(int k = i; k<=j; k++){
                    System.out.print(arr[k]+" ");
                    sum = sum+arr[k];
                }
                System.out.println("Sum = "+ sum);
                if(sum>max)
                max = sum;
                if(sum<min)
                min = sum;
            }
            System.out.println();
        }
        System.out.println("Maximum of the subarray is : "+ max);
        System.out.println("Minimum of the subarray is : "+ min);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12};
        Sub(arr);
    }
}