package Num16;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int upperCount = 0, lowerCount = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isUpperCase(c)) {
                upperCount++;
            } else if (Character.isLowerCase(c)) {
                lowerCount++;
            }
        }

        if (upperCount > lowerCount) {
            input = input.toUpperCase();
        } else if (lowerCount > upperCount) {
            input = input.toLowerCase();
        } else {
            input = input.toLowerCase();
        }

        System.out.println(input);
    }
}
