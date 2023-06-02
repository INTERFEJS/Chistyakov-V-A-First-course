package Num37;

import java.util.ArrayList;

public class Game {
    ArrayList<Integer> playerNumbers = new ArrayList<>(9);
    ArrayList<Integer> lostPlayers = new ArrayList<>(9);

    public Game() {
        for (int i = 1; i < 8; i++) {
            playerNumbers.add(i);
        }
    }

    public int repeat() {
        return playerNumbers.size();
    }

    public int everyThird(int indexForDelete) {
        int eliminatedPlayer;
        if (indexForDelete >= playerNumbers.size()) {
            while (indexForDelete >=  playerNumbers.size()) {
                indexForDelete -= playerNumbers.size();
            }
        }
        eliminatedPlayer = playerNumbers.get(indexForDelete);
        lostPlayers.add(eliminatedPlayer);
        playerNumbers.remove(indexForDelete);
        return indexForDelete + 2;
    }
}
