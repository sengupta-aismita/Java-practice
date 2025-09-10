//Most frequent element in an array
import java.util.*;
public class MostFrequent {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,2,3,4};
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxFreq = 0;
        int element = arr[0];
        for(int a : arr){
            int freq = map.getOrDefault(a,0)+1;
            map.put(a, freq );
            if(freq>maxFreq){
                maxFreq = freq;
                element = a;
            }
            

        }
        System.out.print(element);
    }
}
