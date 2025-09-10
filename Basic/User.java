import java.util.*;
public class User {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost of pencil, pen and an eraser");
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float total = pencil + pen + eraser;
        System.out.println("Total price is : " +  total);
        float gst = total + (0.18f *total);
        System.out.println("New cost is :" + gst);
        sc.close();
    }
    
}
