public class Even {
    public static boolean isEven(int num){
        if(num == 0 || num%2 == 0){
            return true;
            
        }
            return false;
        
    }
    public static void main(String[] args) {
        System.out.print(isEven(7));
    }
}
