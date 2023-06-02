package Num20;

public class Matrix {
    private static final int ONE = 1;
    private final int[][] matrix;

    public Matrix(int rows, int columns) {
        matrix = new int[rows][columns];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ONE;
            }
        }
    }
    public void filingRing () {
        int repeat = findACentreMatrix();
        for (int r = 1; r < repeat; r++) {
            for (int i = r; i < matrix.length - r; i++) {
                for (int j = r; j < matrix[i].length - r; j++) {
                    if (j != matrix[i].length) {
                        matrix[i][j]++;
                    }
                }
            }
        }
    }
    private int findACentreMatrix (){
        int i = 0;
        int centreDit;
        if (matrix.length % 2 == 0 && matrix[i].length % 2 == 0) {
            i = matrix.length / 2 - 1;
            centreDit = matrix[i].length / 2;
            return centreDit;

        } else if (matrix.length % 2 != 0 && matrix[i].length % 2 != 0){
            i = (matrix.length / 2) + 1;
            centreDit = i;
            return centreDit;

        } else if (matrix.length % 2 == 0 && matrix[i].length % 2 != 0) {
            i = matrix.length / 2 - 1;
            centreDit = i + 1;
            return centreDit;

        } else {
            i = (matrix.length / 2) + 1;
            centreDit = i + 1;

        }
        return centreDit;
    }
    @Override
    public String toString() {
        String matrixa = "\n";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrixa += matrix[i][j] + " ";
            }
            matrixa += "\n";
        }
        return matrixa;
    }
}
