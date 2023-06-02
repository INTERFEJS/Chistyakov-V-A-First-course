package Num9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String word;
        String endingStr;
        Scanner in = new Scanner(System.in);

        System.out.println("Введите слово, конец которого хотите проверить: ");
        word = in.nextLine();

        System.out.println("Введите окончание слова: ");
        endingStr = in.nextLine();

        char[] array = word.toCharArray();
        String rewWord = "";

        for(int i = array.length - 1; 0 <= i; i--){
            rewWord = rewWord + array[i];
        }

        char[] arrayEnd = endingStr.toCharArray();
        String rewEndingStr = "";

        for(int i = arrayEnd.length - 1; 0 <= i; i--){
            rewEndingStr = rewEndingStr + arrayEnd[i];
        }

        char[] arrWord = rewWord.toCharArray();
        char[] arrEndingStr = rewEndingStr.toCharArray();
        int count = 0;

        for(int i = 0; arrEndingStr.length != i; i++){
            if (arrWord[i] == arrEndingStr[i]){
                count++;
            }
        }

        if (count == arrEndingStr.length){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

        in.close();
    }
}
