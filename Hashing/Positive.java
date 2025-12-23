import java.util.HashSet;
import java.util.*;

public class Positive{

    public static int smallestPositive(int[] arr) {
    HashSet<Integer> set = new HashSet<>();
    for (int num : arr) {
        if (num > 0) {
            set.add(num);
        }
    }
    int i = 1;
    while (true) {
        if (!set.contains(i)) {
            return i;
        }
        i++;
    }
}

public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array : ");
    int n= sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter elements of array : ");
    for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
    }
    int result = smallestPositive(arr);
    System.out.println(result);
}

}


