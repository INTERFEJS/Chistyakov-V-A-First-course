package Num12;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int check = 0;
        int firstNumber;
        System.out.println("Введите первое число: ");
        firstNumber = in.nextInt();
        int secondNumber;
        System.out.println("Введите второе число: ");
        secondNumber = in.nextInt();
        ArrayList <Integer> array = new ArrayList<>();


        if ((firstNumber < secondNumber)&&(firstNumber + firstNumber >= secondNumber)){
            int sqrNumber = firstNumber * firstNumber;
            array.add(sqrNumber);
            check = 1;
        }
        else{
            if ((firstNumber > secondNumber)&&(secondNumber + secondNumber >= firstNumber)){
                int sqrNumber = secondNumber * secondNumber;
                array.add(sqrNumber);
                check = 1;
            }
        }

        if (check != 1){
            if (firstNumber < secondNumber){
                for(int i = firstNumber; i != secondNumber+1; i += firstNumber){
                    int sqrNumber = i*i;
                    array.add(sqrNumber);
                    sqrNumber = 0;
                }
            }
            else{
                for(int i = secondNumber; i != firstNumber+1; i += secondNumber){
                    int sqrNumber = i*i;
                    array.add(sqrNumber);
                    sqrNumber = 0;
                }
            }
        }

        System.out.println("Полученная последовательность: "+array);

        in.close();
    }
}
