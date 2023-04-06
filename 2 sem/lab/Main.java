package lab;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер квадратно матрицы: ");
        
        int n = scanner.nextInt();
        Matrix matrix = new Matrix(n);
        
        System.out.println(matrix);

        System.out.println("Диагональные элементы: " + matrix.getDiagonalСalculation());

        System.out.println("Элементы над диагональю: " + matrix.getCalculationOverTheDiagonal());

        System.out.println("Элементы под диагональю: " + matrix.getCalculationUnderTheDiagonal());

        scanner.close();
    }
}