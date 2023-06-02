package Num34;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] List = {"56", "65", "74", "100", "99", "68", "86", "180", "90"};
        String[] sortList = new String[9];
        String[] res = new String[9];
        for (int i = 0; i < List.length; i++) {
            String elementOfArrray = List[i];
            String result = "";
            int plus = 0;
            for (int j = 0; j < elementOfArrray.length(); j++) {
                plus += Integer.parseInt(String.valueOf(elementOfArrray.charAt(j)));
            }
            result += plus;
            sortList[i] = result;
        }
        for (int k = 0; k < 9; k++) { //Заполнение цикла ответ
            int checkForNullInSort = 0;
            if (sortList[checkForNullInSort] == null) {
                while(sortList[checkForNullInSort] == null) {
                    if (checkForNullInSort == 8) {
                        break;
                    }else {
                        checkForNullInSort++;
                    }
                }
            }
            int min = Integer.parseInt(sortList[checkForNullInSort]);
            int indexForOtvet = 0;
            for (int i = 1; i < sortList.length; i++) {
                if (sortList[i] != null) {
                    if (Integer.parseInt(sortList[i]) < min) {
                        min = Integer.parseInt(sortList[i]);
                        indexForOtvet = i;
                    }
                }
            }
            if (indexForOtvet == 0) {
                sortList[checkForNullInSort] = null;
                res[k] = List[checkForNullInSort];
            } else {
                sortList[indexForOtvet] = null;
                res[k] = List[indexForOtvet];
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
