package Num36;

public class Game {
    public static final int[] correctAnswer = new int[4];
    public static final int[] intUserText = new int[4];
    private static final int DOWN = 0;
    private static final int UP = 50;

    public Game() {
        for (int i = 0; i < 4; i++) {
            int oneDit = DOWN + (int) (Math.random() * UP);
            correctAnswer[i] = oneDit;
        }
    }

    public int guessTheCode(String userText) {
        StringInArray(userText);
        return checkCorrectAnswer();
    }

    private void StringInArray(String userText) {
        char checkLetter;
        int indexForArray = 0;
        int checkIndexForSpace = 0;
        String result = "";
        for (int i = 0; i < userText.length(); i++) {
            checkLetter = userText.charAt(i);
            if (checkLetter == ' ') {
                result = userText.substring(checkIndexForSpace, i);
                checkIndexForSpace = i + 1;
                intUserText[indexForArray] = Integer.parseInt(result);
                indexForArray++;
            }
            if (i == userText.length() - 1) {
                result = userText.substring(checkIndexForSpace);
                intUserText[indexForArray] = Integer.parseInt(result);
            }
        }
    }
    private int checkCorrectAnswer() {
        int checkForCorrect= 0;
        for (int i = 0; i < correctAnswer.length; i++) {
            for (int j = 0; j < intUserText.length; j++) {
                if (correctAnswer[i] == intUserText[j]){
                    checkForCorrect++;
                }
            }
        }
        return checkForCorrect;
    }
    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < correctAnswer.length; i++) {
            result += correctAnswer[i] + " ";
        }
        return result;
    }
}
