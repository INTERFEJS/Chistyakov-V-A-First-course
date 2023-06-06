package Num41;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество секунд");
        int userSec = scanner.nextInt();
        Calculate calculate = new Calculate();
        calculate.Calculating(userSec);
        System.out.println(calculate);

    }
}