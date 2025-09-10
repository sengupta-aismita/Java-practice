public class Pattern4 {
    public static void Pattern(int num){
        int counter = 1;
       for(int i= 1; i<=num;i++){
        for(int j=1;j<=i;j++){
            System.out.print(counter + " ");
            counter++;
        }
        System.out.println();
       }
    }
    public static void main(String[] args) {
        Pattern(7);
    }
}
