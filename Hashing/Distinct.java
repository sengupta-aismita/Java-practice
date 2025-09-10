//count distinct elements
public class Distinct {
    public static void main(String[] args) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        int arr[] = {1,2,2,3,3,4,5};
        for(int a: arr){
            set.add(a);
        }
        System.out.println(set.size());
    }
}