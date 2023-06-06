package Num43;

import java.util.ArrayList;
public class PyramidOfNumbers {

    int countOfMass;
    StringBuilder result = new StringBuilder();
    ArrayList list;

    public PyramidOfNumbers(ArrayList allMass, int height) {
        list = allMass;
        countOfMass = height;
    }

    public int findMaximum() {
        int max = Integer.parseInt(String.valueOf(list.get(countOfMass - 1)));
        int index = 0;
        int dit = 0;
        char checkLetter;
        char checkNextLetter;
        String checkStroka = (String) list.get(countOfMass - 2);
        for (int i = 0; i < checkStroka.length(); i++) {
            checkLetter = checkStroka.charAt(i);
            if (checkLetter != ' ') {
                if (Integer.parseInt(String.valueOf(checkLetter)) > dit) {
                    dit = Integer.parseInt(String.valueOf(checkLetter));
                    index = i;
                }
            }
        }
        max += dit;
        if (countOfMass > 2) {
            for (int i = countOfMass - 3; i >= 0; i--) {
                checkStroka = (String) list.get(i);
                checkLetter = checkStroka.charAt(index);
                checkNextLetter = checkStroka.charAt(index + 2);
                if (Integer.parseInt(String.valueOf(checkLetter)) > Integer.parseInt(String.valueOf(checkNextLetter))) {
                    dit = Integer.parseInt(String.valueOf(checkLetter));
                } else {
                    dit = Integer.parseInt(String.valueOf(checkStroka.charAt(index + 2)));
                    index += 2;
                }
                max += dit;
            }
        }
        return max;
    }
    @Override
    public String toString() {
        int count = countOfMass;
        for (int i = count - 1; i >= 0; i--) {
            result.append(" ".repeat(Math.max(0, count - 1)));
            count--;
            result.append(list.get(i)).append("\n");
        }
        return result.toString();
    }
}
