package pract.pr_1;

import java.util.Scanner;

class NumSqrt {

    public static void main(String[] args){

        System.out.print("Введите число. Для завершения введите 0: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        double sqrt = 0;

        while(number != 0){
        
        
        sqrt = Math.sqrt(number);
        String result = String.format("%.0f", sqrt);
        System.out.println("Ближайшее число: " +result);
        double sq = Double.parseDouble(result);
        sq *= sq;
        String res = String.format("%.0f", sq);
        System.out.println("Его квадрат равен: " +res);
        System.out.println("Введите число: ");
        number = in.nextInt();

        }

    }
    
}
