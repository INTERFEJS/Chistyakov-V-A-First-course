package Num23;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите число");
        int userDit = scanner1.nextInt();
        System.out.println("Введите первый делитель");
        int firstDivider = scanner1.nextInt();
        System.out.println("Введите второй делитель");
        int secondDivider = scanner1.nextInt();
        int checkFirstDivider = 0;
        int checkSecondDivider = 0;

        for (int i = 1; i <= userDit ; i++) {
            if (i % firstDivider == 0) {
                checkFirstDivider += i;
            } else if (i % secondDivider == 0) {
                checkSecondDivider += i;
            }
        }
        System.out.println("Сумма делителей равна " + (checkFirstDivider + checkSecondDivider));
    }
}
