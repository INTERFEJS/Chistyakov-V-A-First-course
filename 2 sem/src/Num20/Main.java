package Num20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите высоту");
        int rows = scanner1.nextInt();
        System.out.println("Введите ширину");
        int colums = scanner1.nextInt();
        Matrix matrix = new Matrix(rows, colums);
        matrix.filingRing();
        System.out.println(matrix);
    }
}
