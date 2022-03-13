package lab.nine;

public class Matrices {
    public static void main(String[] args) {
        int [][]a = {{1,2,3}, {4,5,6}, {7,8,9}};
        int [][]b = {{1,2,3}, {4,5,6}, {7,8,9}};
        add(a, b);
    }
    public static int[][] add(int[][] a, int[][] b) {
        for (int r = 0; r < a.length; r++) {
            for (int c = 0; c < a[r].length; c++) {
                a[r][c] += b[r][c];
            }
        }
        return a;
    }

    public static int[][] subtract(int[][] a, int[][] b) {
        for (int r = 0; r < a.length; r++) {
            for (int c = 0; c < a[r].length; c++) {
                a[r][c] -= b[r][c];
            }
        }
        return a;
    }

    public static int[][] multiply(int[][] a, int[][] b) {
        int[][] r = new int[a.length][b[0].length];

        for(int i = 0;i < a.length; i++){
            for(int j = 0;j < b[0].length;j++){
                for(int k = 0;k < a[0].length;k++){
                    r[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return r;
    }
}
