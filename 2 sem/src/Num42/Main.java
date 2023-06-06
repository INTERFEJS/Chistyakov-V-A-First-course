package Num42;

import java.util.ArrayList;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> dits = new ArrayList<>();
        int[][] numbers = {{1, 2}, {6, 10}, {11, 15}};
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (j == 1) {
                    dits.add(numbers[i][j] - numbers[i][j - 1]);
                }
            }
        }
        for (int i = 0; i < dits.size(); i++) {
            result += dits.get(i);
        }
        System.out.println(Arrays.deepToString(numbers) + " => " + result);
    }
}
