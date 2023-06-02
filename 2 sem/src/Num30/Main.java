package Num30;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static ArrayList<Integer> chooseBestSum(int maxDistance, int citiesToVisit, int[] cityDistances) {
        ArrayList<Integer> bestCombination = null;
        int bestDistance = 0;

        int[] indices = new int[citiesToVisit];
        for (int i = 0; i < citiesToVisit; i++) {
            indices[i] = i;
        }
        while (indices[0] <= cityDistances.length - citiesToVisit) {
            ArrayList<Integer> combination = new ArrayList<>();
            for (int index : indices) {
                combination.add(cityDistances[index]);
            }

            int combinationDistance = combination.stream().mapToInt(Integer::intValue).sum();
            if (combinationDistance <= maxDistance) {
                if (combinationDistance > bestDistance) {
                    bestDistance = combinationDistance;
                    bestCombination = combination;
                }
            }

            int i = citiesToVisit - 1;
            while (i >= 0 && indices[i] == cityDistances.length - citiesToVisit + i) {
                i--;
            }
            if (i < 0) {
                break;
            }
            indices[i]++;
            for (int j = i + 1; j < citiesToVisit; j++) {
                indices[j] = indices[j - 1] + 1;
            }
        }

        return bestCombination;
    }

    public static void main(String args[]) {
        int[] cityDistances = {50, 55, 57, 58, 60};
        int maxDistance = 163;
        int citiesToVisit = 3;
        ArrayList<Integer> bestCombination = chooseBestSum(maxDistance, citiesToVisit, cityDistances);
        if (bestCombination != null) {
            System.out.println("Максимальное расстояние: " + maxDistance);
            System.out.println("Лучшая комбинация: " + Arrays.toString(bestCombination.toArray()));
        } else {
            System.out.println("Не найдена хорошая комбинация.");
        }
    }
}
