import java.util.*;
public class TwoSum {

    public int[] two(int arr[], int target){
        HashMap<Integer, Integer> map = new HashMap<>(); //element, index
        for(int i = 0; i < arr.length; i++){
            int diff = target - arr[i];  //we checkif the map contains the difference between target and the curr element
            if(map.containsKey(diff)){
                return new int[] {i, map.get(diff)}; //if contains then we return the curr index and the difference element index
            }
            map.put(arr[i],i); //we put the curr element with it index to check if there are further matches
        }
        return new int[] {0,0}; // default return if no pair found
    }
    public static void main(String[] args) {
        
    }
}
