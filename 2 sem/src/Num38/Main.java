package Num38;

import java.util.Scanner;

public class Main {
    public static final String ADDTEXT = "ауч";
    public static final char[] punctuationMarks = {' ', ',', '.', '!', '?', ':', ';', '-', '"'};

    public static void main(String[] args) {
        System.out.println("Введите текст");
        Scanner scanner = new Scanner(System.in);
        String userText = scanner.nextLine();
        String[] words = userText.split(" ");
        String result = "";
        String checkLetter;
        for (int i = 0; i < words.length; i++) {
            String punctuation = "";
            result += " ";
            for (int j = 0; j < punctuationMarks.length; j++) {
                if (words[i].substring(words[i].length() - 1).equals(Character.toString(punctuationMarks[j]))) {
                    punctuation += punctuationMarks[j];
                }
            }
            StringBuffer sb = new StringBuffer(words[i]);
            checkLetter = words[i].substring(0, 1);
            sb.delete(sb.length() - 1, sb.length());
            sb.delete(0, 1);
            result += sb + checkLetter + ADDTEXT + punctuation;
        }
        System.out.println(result);
    }
}
