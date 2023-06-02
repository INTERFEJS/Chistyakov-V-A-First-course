package Num11;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //Задаём переменные
        String encoding = System.getProperty("console.encoding", "cp866");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String result = "";

        char[] array = str.toCharArray();
        ArrayList <String> arrayStr = new ArrayList<>();

        //Превращаем обычный массив типа char в ArrayList типа String
        for(int k = 0; k != array.length; k++){
            result = result + array[k];
            arrayStr.add(result);
            result = "";
        }

        //Создаём массив с гласными
        ArrayList <String> arrayOfVowel = new ArrayList<>();
        arrayOfVowel.add("у");
        arrayOfVowel.add("е");
        arrayOfVowel.add("ы");
        arrayOfVowel.add("а");
        arrayOfVowel.add("о");
        arrayOfVowel.add("э");
        arrayOfVowel.add("я");
        arrayOfVowel.add("и");
        arrayOfVowel.add("ю");
        arrayOfVowel.add("ё");

        //Удаляем из массива все гласные
        for(int i = 0; i != arrayStr.size()-1; i++){
            int l = i;
            for(int g = 0; g != arrayOfVowel.size(); g++){
                if (arrayStr.get(l).equals(arrayOfVowel.get(g))){
                    arrayStr.remove(l);
                    i = -1;
                }
            }
        }

        //Проверяем остались ли элементы в массиве и выводим результат
        int check = 0;
        for(int g = 0; g != arrayOfVowel.size(); g++){
            if (arrayStr.get(0).equals(arrayOfVowel.get(g))){
                check = 1;
                System.out.println("В строке нет согласных букв!");
            }
        }

        if (check == 0){
            result = "";
            for(int j = 0; j != arrayStr.size(); j++){
                result = result + arrayStr.get(j);
            }

            System.out.println(result);
        }
        in.close();
    }
}
