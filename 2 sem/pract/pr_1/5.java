package pract.pr_1;

import java.util.Scanner;
import java.util.ArrayList;

class Sqrt {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        ArrayList <Integer> arrayOfNumbers = new ArrayList<>();
        int number = 1;
        int sum = 0;

        System.out.println("Вводите числа, по завешении введите 0");
        for(int i = 0; number != 0; i++){

            System.out.print("Введите число: ");
            arrayOfNumbers.add(in.nextInt());
            sum += (arrayOfNumbers.get(i) * arrayOfNumbers.get(i));
            number = arrayOfNumbers.get(i);

        }

        in.close();
        System.out.println("Сумма квадратов числел: "+sum);
    }
    
}
