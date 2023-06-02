package Num27;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите текст");
        String userText = scanner1.nextLine();
        System.out.println("Введите шаг");
        int step = scanner1.nextInt();
        Caesar caesar = new Caesar();
        System.out.println(caesar.encryption(userText, step));
    }
}
