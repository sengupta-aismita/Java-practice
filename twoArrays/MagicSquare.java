package twoArrays;

public class MagicSquare {

    public static String magicSquare(int mat[][]) {
        int sum_magic = 0;
        //first row
        for(int j=0;j<mat[0].length;j++){
            sum_magic += mat[0][j];
        }

        for(int i=0;i<mat.length;i++){
            int row_sum =0;
            for(int j=0;j<mat[0].length;j++){
                row_sum += mat[i][j];
            }
            if(row_sum != sum_magic)
            return "Not a Magic Square";
        }
        
         for(int j=0;j<mat[0].length;j++){
            int col_sum=0;
            for(int i=0;i<mat[0].length;i++){
                
                //sum of column
               col_sum += mat[i][j];
                
            }
             if(col_sum != sum_magic)
            return "Not a Magic Square";
        }

        int diag1=0, diag2 = 0;
        for(int i =0;i<mat.length;i++){
            diag1 += mat[i][i];
            diag2 += mat[i][mat.length-i-1];
        }
        if(diag1 != sum_magic || diag2 != sum_magic)
        return "Not a Magic Square";
        
        return "Magic Square";
    }
    
    public static void main(String args[]){
        int mat[][] = {
             {2, 7, 6}, {9, 5, 1}, {4, 3, 8}
        };
        System.out.print(magicSquare(mat));

    }
}
