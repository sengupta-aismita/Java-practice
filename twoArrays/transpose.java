public class transpose {
    public static void main(String[] args) {
        int matrix[][] = {
            {1,2,3},
            {4,5,6}
        };
        print(matrix);
        int transpose[][] = new int [matrix[0].length][matrix.length];
        for(int i = 0; i<matrix.length;i++){
            for(int j=0; j<matrix[0].length;j++){
                 transpose[j][i]=matrix[i][j] ;
            }
        }
        print(transpose);
    }

    static void print(int matrix[][]){
        for(int i = 0; i<matrix.length;i++){
            for(int j=0; j<matrix[0].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
