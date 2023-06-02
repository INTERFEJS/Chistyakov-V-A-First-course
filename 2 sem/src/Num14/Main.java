package Num14;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] memory = {0, 0, 0};
        int inputNumber;
        int min = 10000000;

        for(int i = 0; i < memory.length; i++){

            System.out.print("Введите число: ");
            inputNumber = in.nextInt();

            if (min > inputNumber){
                min = inputNumber;
            }

            if (memory[0] == 0 || memory[1] == 0 || memory[2] == 0){
                if (memory[0] == 0){
                    memory[0] = inputNumber;
                }
                else if(memory[1] == 0){
                    memory[1] = inputNumber;
                }
                else if(memory[2] == 0){
                    memory[2] = inputNumber;
                }
                else{
                    memory[2] = min;
                }
            }
        }

        System.out.println(memory[0]+", "+memory[1]+", "+memory[2]);

    }
}
