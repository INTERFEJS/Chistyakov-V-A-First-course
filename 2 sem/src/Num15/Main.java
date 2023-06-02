package Num15;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static String removeRepeatingWords(String string) {
        String[] words = string.split("\\s+");
        List<String> nonRepeatingWords = new ArrayList<>();
        for (String word : words) {
            if (!nonRepeatingWords.contains(word)) {
                nonRepeatingWords.add(word);
            }
        }
        return String.join(" ", nonRepeatingWords);
    }

    public static void main(String[] args) {
        String string = "dfdf agg ab abc ab acs acs";
        String result = removeRepeatingWords(string);
        System.out.println(result); // "abc ab acs"
    }
}