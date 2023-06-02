package Num13;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList <Integer> array = new ArrayList<>();

        System.out.println("Введите число, с которого начнётся ряд: ");
        int startOfRow;
        startOfRow = in.nextInt();
        array.add(startOfRow);

        System.out.println("Введите число, которое будет шагом в последовательности: ");
        int step;
        step = in.nextInt();

        System.out.println("Введите число, которое будет количеством шагов: ");
        int numberOfStep;
        numberOfStep = in.nextInt();

        int number = startOfRow;
        for(int i = 1; i != numberOfStep; i++){
            number += step;
            array.add(number);
        }

        System.out.println("Полученная последовательность: "+array);

        in.close();
    }
}
