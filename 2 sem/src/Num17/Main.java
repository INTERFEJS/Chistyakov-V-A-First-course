package Num17;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Вводите скобки: ");
        String userText = scanner1.nextLine();
        char checksimbol;
        int open = 0;
        int close = 0;
        for (int i = 0; i < userText.length(); i++) {
            checksimbol = userText.charAt(i);
            if (checksimbol == '(') {
                open++;
            } else {
                close++;
            }
        }
        if (open == close) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
