package Num25;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите числa");
        String userText = scanner1.nextLine();
        String [] massi = userText.split(" ");
        int sum = 0;
        int check = 0;

        for (int i = Integer.parseInt(massi[0]); i < Integer.parseInt(massi[1]); i++) {
            check = 0;
            for (int j = 2; j < massi.length; j++) {
                if (i % Integer.parseInt(massi[j]) == 0 ) check++;
            }
            if (check == massi.length - 2) sum+=i;
        }
        System.out.println(sum);
    }
}
