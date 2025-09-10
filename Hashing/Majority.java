//Majority element 2...greater than n/3

public class Majority {
    public static void main(String[] args) {
        // code here
        int arr[] ={1,2,2,2,3,4,4,4,4,4,5};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        
        for(int key : map.keySet()){
            if(map.get(key) > arr.length/3)
            System.out.println(key);
        }
    }
}