import java.util.*;

public class Matrices {

    static void search(int matrix[][]){
        int largest= Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
         for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                 if(matrix[i][j]>largest)
                 largest = matrix[i][j];
                 if(matrix[i][j]<smallest)
                 smallest = matrix[i][j];
            }
        }

        System.out.println("Largest element is : "+largest);
        System.out.println("Smallest element is : "+smallest);
    }
    public static void main(String[] args) {
        // code here
        int matrix[][] = new int [3][3];
        int n=matrix.length, m=matrix[0].length;
        Scanner sc = new Scanner(System.in);
        int key = 5;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                  matrix[i][j]= sc.nextInt();
            }
        }
         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                  System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
       search(matrix);
    }
}
