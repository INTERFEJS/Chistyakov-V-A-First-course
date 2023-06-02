package Num22;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите первую сторону:");
        int sideA = scanner1.nextInt();
        System.out.println("Введите вторую сторону:");
        int sideB = scanner1.nextInt();
        System.out.println("Введите третью сторону:");
        int sideC = scanner1.nextInt();
        Triangle triangle = new Triangle(sideA, sideB, sideC);
        if (triangle.checkForTriangle() && triangle.areaOfATriangle() != 0) {
            System.out.println("Возможно построить треугольник! Его площадь: " + triangle.areaOfATriangle());
        } else if (triangle.checkForTriangle()) {
            System.out.println("Возможно построить треугольник! Посчитать площадь не удалось" );
        } else {
            System.out.println("Вы не сможете построить треугольник");
        }
    }
}
