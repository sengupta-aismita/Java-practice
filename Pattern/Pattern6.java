
public class Pattern6 {
    public static void Pattern(int num){
        
       for(int i= 1; i<=num;i++){
        for(int j=1;j<=num-i;j++){
          System.out.print(" ");
        }
        for(int j= 1; j<=num;j++){
           
            System.out.print("*");
        }
        System.out.println();
       }
    }
    public static void main(String[] args) {
        Pattern(5);
    }
}


