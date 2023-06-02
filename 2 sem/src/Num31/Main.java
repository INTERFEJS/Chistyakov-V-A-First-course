package Num31;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int[][] fibonacciDigitCount(int i) {

        int[] fib = new int[i+1];
        fib[0] = 0;
        fib[1] = 1;
        for (int j = 2; j <= i; j++) {
            fib[j] = fib[j-1] + fib[j-2];
        }


        int[] digitCounts = new int[10];
        for (char digit : Integer.toString(fib[i]).toCharArray()) {
            digitCounts[Character.getNumericValue(digit)]++;
        }


        int maxDigits = -1;
        int maxCount = 0;
        for (int digit = 0; digit < 10; digit++) {
            if (digitCounts[digit] > maxCount) {
                maxDigits = digit;
                maxCount = digitCounts[digit];
            } else if (digitCounts[digit] == maxCount && maxDigits != -1) {
                maxDigits = Math.max(maxDigits, digit);
            }
        }

        return new int[][]{{maxCount, maxDigits}};
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число от 10 до 100000: ");
        int i = scanner.nextInt();
        scanner.close();

        int[][] result = fibonacciDigitCount(i);

        System.out.println("f(" + i + ") = " + Arrays.toString(result[0]));
    }
}
