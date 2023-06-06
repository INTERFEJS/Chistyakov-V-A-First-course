package Num43;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    static ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Задайте высоту пирамиды");
        int height = scanner.nextInt();
        System.out.println("Вводите числа через пробел!");
        for (int i = 0; i < height; i++) {
            System.out.println("Введите числа на " + (i + 1) + " уровне, в количестве " + (height - i) + " штук/и");
            list.add(reader.readLine());
        }
        PyramidOfNumbers PyramidOfNumbers = new PyramidOfNumbers(list, height);
        System.out.println(PyramidOfNumbers);
        System.out.println("Программа выведет " + PyramidOfNumbers.findMaximum());
    }
}
