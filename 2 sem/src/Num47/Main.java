package Num47;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int checkForWhile = 1;
        String resulSimpleMatrix = "";
        String resultChangeMatrix = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во строк");
        int rows = scanner.nextInt();
        System.out.println("Введите кол-во колонн");
        int colums = scanner.nextInt();
        System.out.println("Введите кол-во чисел для генерации");
        int userDit = scanner.nextInt();
        while (checkForWhile > 0) {
            if (rows == colums || (colums * rows != userDit)) {
                System.out.println("Введенные вами данные соответвуют всем правилам заполнения");
                checkForWhile = 0;
                Matrix matrix = new Matrix();
                matrix.matrixFiling(rows, colums);
                resulSimpleMatrix = matrix.toString();
                SnakeTrans snakeTrans = new SnakeTrans();
                snakeTrans.convertToSpiralMatrix(rows, colums);
                resultChangeMatrix = String.valueOf(snakeTrans);
            } else {
                System.out.println("Повторите попытку ввода");
                System.out.println("Введите кол-во строк");
                rows = scanner.nextInt();
                System.out.println("Введите кол-во колонн");
                colums = scanner.nextInt();
                System.out.println("Введите кол-во чисел для генерации");
                userDit = scanner.nextInt();
            }
        }
        System.out.println("Ваша исходная матрица " + resulSimpleMatrix);
        System.out.println("Ваша измененная матрица " + resultChangeMatrix);
    }
}
