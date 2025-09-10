import java.util.*;

public class Union {
    //Union
    static int[] Union(int arr[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();

        for (int a : arr) {
            set.add(a);
        }
        for (int a : arr2) {
            set.add(a);
        }
        int result[] = new int[set.size()];
        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }

        return result;
    }

    static HashSet<Integer> Intersection(int[] arr, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();
        int count = 0;
         for (int a : arr) {
            set.add(a);
        }
        for(int a : arr2){
            if(set.contains(a)){
                intersection.add(a);
            }
        }
        return intersection;

    }

    public static void main(String[] args) {
        // code here
        int arr[] = {1,2,3,4,5};
        int arr2[] = {4,5,6,7};
        // int union[] = Union(arr, arr2);
        // for(int i = 0; i < 26; i++){
        //     System.out.print(union[i] + " ");
        // }
        HashSet<Integer> inter = Intersection(arr, arr2);
        System.out.println(inter);

    }
}
