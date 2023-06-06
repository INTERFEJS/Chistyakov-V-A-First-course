package Num46;

import Num45.Calculate;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите римский год, который необходимо перевести в арабский");
        String data = scanner.nextLine();
        Calculation calculation = new Calculation();
        System.out.println(calculation.calculate(data));
    }
}

