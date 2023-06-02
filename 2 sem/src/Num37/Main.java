package Num37;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        int i = 1;
        int indexForDelete = 2;
        int repeat = game.repeat();
        while(i < repeat + 1) {
            indexForDelete = game.everyThird(indexForDelete);
            System.out.println(game.playerNumbers.toString() + " => " + game.lostPlayers.get(i - 1) + " is counted out and goes into the result " + game.lostPlayers.toString());
            i++;
        }
    }
}
