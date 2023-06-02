package Num33;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество палочек");
        int numberOfSticks = scanner.nextInt();
        Game game = new Game();
        if (numberOfSticks % 2 == 0 || game.IsSimple(numberOfSticks) && numberOfSticks != 7 && numberOfSticks != 11) {
            System.out.println("Таня выиграла, у нее " + game.game(numberOfSticks) + " палочек");
        } else {
            System.out.println("Таня выиграла, у нее " + game.game(numberOfSticks) + " палочек");
        }
    }
}
