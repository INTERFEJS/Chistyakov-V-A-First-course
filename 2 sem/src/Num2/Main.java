package Num2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int value = 0;
        int count = 0;
        ArrayList<Boolean> msv = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        System.out.println("Если хотите остановить ввод, введите 2:");

        while(value != 2){
            if(value != 2){

                System.out.println("Введите 1 или 0: ");
                value = in.nextInt();

                if(value == 1){

                    msv.add(true);
                    count++;
                } else{

                    if(value == 0){

                        msv.add(false);
                    }
                }
            }

        }

        in.close();
        System.out.println("Итоговый массив: " +msv);
        System.out.println("Количество сотрудников которые зашли на предприятие: " +count);

    }
}
