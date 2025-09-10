package Arrays;
import java.util.*;

public class linear {

    static void LSearch(int arr[], int num){
        for(int i = 0; i < arr.length;i++){
              if(arr[i] == num){
                System.out.println(num+" is in "+i+"th index");
              }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int arr[] = {2,3,9,7,6};
        LSearch(arr,num);
        sc.close();
    }
}
