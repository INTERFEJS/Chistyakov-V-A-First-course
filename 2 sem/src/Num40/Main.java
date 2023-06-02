package Num40;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ряд чисел: ");
        String input = scanner.nextLine().trim();

        int[] arr = convertToIntArray(input.split(","));

        List<String> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int j = i;
            while (j + 1 < arr.length && arr[j + 1] == arr[j] + 1) {
                j++;
            }
            if (j > i) {
                result.add(String.format("%d...%d", arr[i], arr[j]));
            } else {
                result.add(Integer.toString(arr[i]));
            }
            i = j;
        }

        System.out.println(String.join(",", result));
    }

    private static int[] convertToIntArray(String[] strs) {
        int[] arr = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            arr[i] = Integer.parseInt(strs[i].trim());
        }
        return arr;
    }
}
