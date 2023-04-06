package pract.pr_1;

import java.util.Scanner;

class StrCount {
    public static void main(String[] args){

        String word;
        String сomparisonСharacter;
        Scanner in = new Scanner(System.in);
        int strCount = 0;

        System.out.println("Введите слово, элементы в котором нужно подсчитать: ");
        word = in.nextLine();
        System.out.println("Введите символ, который вы хотите подсчитать в слове: ");
        сomparisonСharacter = in.nextLine();
        String[] strToArray = word.split("");

        for(int i = 0; i < strToArray.length; i++){
            if (strToArray[i].equals(сomparisonСharacter)){
                strCount++;
            }
        }
        System.out.print("Количество символов "+сomparisonСharacter);
        System.out.print(" равно "+strCount);

        in.close();
    }
    
}
