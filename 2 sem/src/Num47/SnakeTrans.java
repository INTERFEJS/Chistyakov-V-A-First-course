package Num47;

import java.util.ArrayList;

public class SnakeTrans {
    ArrayList<Integer> ditsForArray = new ArrayList<>();
    int[][] matrix = Matrix.matrix;

    private int[][] spiralMatrix;
    StringBuilder result = new StringBuilder();

    public void convertToSpiralMatrix(int rows, int columns) {
        spiralMatrix = new int[rows][columns];
        fillingArray(rows, columns);
        int indexForArrray = 0;
        for (int i = 0; i < spiralMatrix.length; i++) {
            for (int j = 0; j < spiralMatrix[i].length; j++) {
                spiralMatrix[i][j] = ditsForArray.get(indexForArrray);
                indexForArrray++;
            }
        }
    }

    public void fillingArray(int rows, int columns) {
        int top = 0, bottom = rows - 1, left = 0, right = rows - 1;

        int count = 1;

        while (count <= (columns * rows)) {
            for (int i = left; i <= right; i++) {
                ditsForArray.add(matrix[top][i]);
                count++;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                ditsForArray.add(matrix[i][right]);
                count++;
            }
            right--;

            for (int i = right; i >= left; i--) {
                ditsForArray.add(matrix[bottom][i]);
                count++;
            }
            bottom--;

            for (int i = bottom; i >= top; i--) {
                ditsForArray.add(matrix[i][left]);
                count++;
            }
            left++;
        }
    }

    @Override
    public String toString() {
        result.append("\n");
        for (int i = 0; i < spiralMatrix.length; i++) {
            for (int j = 0; j < spiralMatrix[i].length; j++) {
                result.append(spiralMatrix[i][j]).append(" ");
            }
            result.append("\n");
        }
        return result.toString();
    }
}
