package twoArrays;

public class MinOne {
    static int minRow(int mat[][]) {
        // code here
        int min = Integer.MAX_VALUE;
        int min_count = 0;
        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    count++;
                }
            }

            if (count < min) {
                min = Math.min(count, min);
                min_count = i;
            }

        }
        return min_count+1;
    }

    public static void main(String args[]) {
        int mat[][] = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };
        System.out.print(minRow(mat));
    }
}
