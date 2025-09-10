public class Largest {
    public static void main(String[] args) {
        // code here
        String fruits[]={"apple", "banana", "mango"};
        String largest = fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(largest.compareToIgnoreCase(fruits[i])<0)
            largest = fruits[i];
        }
        System.out.print("Largest is "+ largest);
    }
}
