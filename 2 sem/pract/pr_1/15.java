package pract.pr_1;

import java.util.Scanner;
import java.util.ArrayList;

class WordCheck {
    
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] strArray = str.split(" ");
        String[] check = strArray;
        ArrayList <String> result = new ArrayList<>();
        result.add(strArray[0]);

        for(int i = 1; i < strArray.length; i++){
            for(int g = 0; g < result.size(); g++){
                if (strArray[i] != result.get(g)){
                    result.add(strArray[i]);
                    g = 0;
                }
            }
        }
        System.out.println(result);
    }
}
