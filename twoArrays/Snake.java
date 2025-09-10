public class Snake {

    public static void printSnake(int matrix[][]){
            for(int i=0;i<matrix.length;i++){
                
                    if(i%2!=0){
                        for(int j=matrix[0].length-1;j>=0;j--){
                            System.out.print(matrix[i][j] + " ");
                        }
                    }
                    else{
                        for(int j=0;j<matrix[0].length;j++){
                            System.out.print(matrix[i][j] + " ");
                        }
                    }
                
            }

    }

    public static void main(String args[]){
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        printSnake(matrix);
    }
}
