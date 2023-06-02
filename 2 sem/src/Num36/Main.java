package Num36;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вам необходимо угадать код состоящий из 4-ех цыфр от 0 до 50, вам предоставляется 20 попыток" + "\n" + "Введите код!");
        Game game = new Game();
        String userText = scanner.nextLine();
        int attempt = 1;
        //System.out.println(game); правильный ответ
        while(game.guessTheCode(userText) != 4) {
            if (game.guessTheCode(userText) == 4) {
                System.out.println("Вы угадали код");
                break;
            } else if (attempt == 20) {
                System.out.println("Вы не угадали код, исчерпан лимит попыток");
                break;
            } else {
                System.out.println("Из загаданного кода совпало " + game.guessTheCode(userText) + " цыфр" + "\n" + "Повторите попытку ввода" + "\n");
                attempt++;
                userText = scanner.nextLine();
            }
        }
    }
}
