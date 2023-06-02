package Num10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String encoding = System.getProperty("console.encoding", "cp866");
        Scanner in = new Scanner(System.in, encoding);
        String name;
        String result = "";
        char firstSym;
        System.out.print("Введите имя: ");
        name = in.nextLine();

        name = name.toLowerCase();
        char[] array = name.toCharArray();
        firstSym = array[0];
        String fs = String.valueOf(firstSym);
        fs = fs.toUpperCase();
        firstSym = fs.charAt(0);
        array[0] = firstSym;
        for(int i = 0; i != array.length; i++){
            result = result + array[i];
        }

        System.out.print("Привет, "+result);
        System.out.print("!");

        in.close();
    }
}
