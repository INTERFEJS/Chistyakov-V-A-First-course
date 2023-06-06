package Num44;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вводите неотрицательные числа!");
        System.out.println("Введите первое число");
        String str1 = scanner.nextLine();
        System.out.println("Введите второе число");
        String str2 = scanner.nextLine();
        StringBuilder result = new StringBuilder();
        int dit1 = Integer.parseInt(str1);
        int dit2 = Integer.parseInt(str2);
        if (dit1 < 0 || dit2 < 0) {
            System.out.println("Вы ввели отрицательное число");
        }else {
            int dit = dit1 + dit2;
            result.append(dit);
        }
        System.out.println(result);
    }
}
