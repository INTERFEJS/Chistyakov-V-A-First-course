package pract.pr_1;

import java.util.Scanner;

class PrimeNumbers{

    public static void main(String[] args){

        System.out.println("Введите число, которое хотите проверить или введите 0 для завершения: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        while(number != 0){
            if(number == 2 || number == 3){
                
                System.out.println("Это число является простым!");
                System.out.println("Введите число, которое хотите проверить или введите 0 для завершения: ");
                number = in.nextInt();

            }
            else{

            if((number % 2 != 0) && (number % 3 != 0)){

                System.out.println("Это число является простым!");
                System.out.println("Введите число, которое хотите проверить или введите 0 для завершения: ");
                number = in.nextInt();

            }
            else{

                System.out.println("Это число не является простым!");
                System.out.println("Введите число, которое хотите проверить или введите 0 для завершения: ");
                number = in.nextInt();
                }
            }
        }
        
        in.close();
    }

}