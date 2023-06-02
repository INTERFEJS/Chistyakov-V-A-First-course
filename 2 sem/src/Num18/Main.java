package Num18;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Вводите числа через пробел: ");
        String input = scanner.nextLine();
        String[] strArray = input.split(" ");
        int[] arr = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            arr[i] = Integer.parseInt(strArray[i]);
        }

        int[] result = max_value_and_split(arr);
        int maxVal = result[0];
        int maxIndex = result[1];

        int[] leftArr = Arrays.copyOfRange(arr, 0, maxIndex);
        int[] rightArr = Arrays.copyOfRange(arr, maxIndex + 1, arr.length);

        // Printing out the results
        System.out.println("Максимальное значение: " + maxVal);
        System.out.println("Левее: " + Arrays.toString(leftArr));
        System.out.println("Правее: " + Arrays.toString(rightArr));
    }

    public static int[] max_value_and_split(int[] arr) {

        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }

        return new int[]{arr[maxIndex], maxIndex};
    }
}
