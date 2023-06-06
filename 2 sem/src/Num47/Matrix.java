package Num47;

import java.util.ArrayList;

public class Matrix {
    public static final int DOWN = 0;
    public static final int UP = 100;
    public static final ArrayList<Integer> list = new ArrayList<>();
    public static int[][] matrix;

    public void matrixFiling(int rows, int colums) {
        matrix = new int[rows][colums];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int randomDit = DOWN + (int) (Math.random() * UP);
                list.add(randomDit);
                matrix[i][j] = randomDit;
            }
        }
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("\n");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result.append(matrix[i][j]).append(" ");
            }
            result.append("\n");
        }
        return result.toString();
    }
}
