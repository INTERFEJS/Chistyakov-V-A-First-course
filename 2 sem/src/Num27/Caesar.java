package Num27;

public class Caesar {
    public static final char [] allUpperENGLetters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    public static final char [] allLowerENGLetter = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    public static final char [] allUpperRUSLetters = {'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З', 'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я'};
    public static final char [] allLowerRUSLetter = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ','ъ', 'ы', 'ь', 'э', 'ю', 'я'};
    public static final char[] punctuationMarks = {' ', ',', '.', '!', '?', ':', ';', '-', '"'};
    public String encryption(String text, int step){
        char checkLetter;
        int index;
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            checkLetter = text.charAt(i);
            index = 0;
            if (Character.isUpperCase(checkLetter)) {
                if (checkLetter >= 'A' && 'Z' >= checkLetter) {
                    for (int j = 0; j < allUpperENGLetters.length; j++) {
                        if (allUpperENGLetters[j] == checkLetter) {
                            index = j + step;
                        }
                    }
                    if (index >= allUpperENGLetters.length) {
                        result += allUpperENGLetters[index - allUpperENGLetters.length];
                    } else if (index < 0){
                        result += allUpperENGLetters[allUpperENGLetters.length + index];
                    } else {
                        result += allUpperENGLetters[index];
                    }
                } else {
                    for (int j = 0; j < allUpperRUSLetters.length; j++) {
                        if (allUpperRUSLetters[j] == checkLetter) {
                            index = j + step;
                        }
                    }
                    if (index >= allUpperRUSLetters.length) {
                        result += allUpperRUSLetters[index - allUpperRUSLetters.length];
                    } else if (index < 0){
                        result += allUpperRUSLetters[allUpperRUSLetters.length + index];
                    } else {
                        result += allUpperRUSLetters[index];
                    }
                }
            } else if (Character.isLowerCase(checkLetter)) {
                if (checkLetter >= 'a' && 'z' >= checkLetter)  {
                    for (int j = 0; j < allLowerENGLetter.length; j++) {
                        if (allLowerENGLetter[j] == checkLetter) {
                            index = j + step;
                        }
                    }
                    if (index >= allLowerENGLetter.length) {
                        result += allLowerENGLetter[index - allLowerENGLetter.length];
                    } else if (index < 0){
                        result += allLowerENGLetter[allLowerENGLetter.length + index];
                    } else {
                        result += allLowerENGLetter[index];
                    }
                } else {
                    for (int j = 0; j < allLowerRUSLetter.length; j++) {
                        if (allLowerRUSLetter[j] == checkLetter) {
                            index = j + step;
                        }
                    }
                    if (index >= allLowerRUSLetter.length) {
                        result += allLowerRUSLetter[index - allLowerRUSLetter.length];
                    } else if (index < 0){
                        result += allLowerRUSLetter[allLowerRUSLetter.length + index];
                    } else {
                        result += allLowerRUSLetter[index];
                    }
                }
            } else {
                for (int j = 0; j < punctuationMarks.length; j++) {
                    if (punctuationMarks[j] == checkLetter) {
                        result += checkLetter;
                        break;
                    }
                }
            }
        }
        return result;
    }
    public String decipheringTheCaesarCipher(String text, int step) {
        char checkLetter;
        int index;
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            checkLetter = text.charAt(i);
            index = 0;
            if (Character.isUpperCase(checkLetter)) {
                if (checkLetter >= 'A' && 'Z' >= checkLetter) {
                    for (int j = 0; j < allUpperENGLetters.length; j++) {
                        if (allUpperENGLetters[j] == checkLetter) {
                            index = j - step;
                        }
                    }
                    if (index >= allUpperENGLetters.length) {
                        result += allUpperENGLetters[index - allUpperENGLetters.length];
                    } else if (index < 0){
                        result += allUpperENGLetters[allUpperENGLetters.length + index];
                    } else {
                        result += allUpperENGLetters[index];
                    }
                } else {
                    for (int j = 0; j < allUpperRUSLetters.length; j++) {
                        if (allUpperRUSLetters[j] == checkLetter) {
                            index = j - step;
                        }
                    }
                    if (index >= allUpperRUSLetters.length) {
                        result += allUpperRUSLetters[index - allUpperRUSLetters.length];
                    } else if (index < 0){
                        result += allUpperRUSLetters[allUpperRUSLetters.length + index];
                    } else {
                        result += allUpperRUSLetters[index];
                    }
                }
            } else if (Character.isLowerCase(checkLetter)) {
                if (checkLetter >= 'a' && 'z' >= checkLetter)  {
                    for (int j = 0; j < allLowerENGLetter.length; j++) {
                        if (allLowerENGLetter[j] == checkLetter) {
                            index = j - step;
                        }
                    }
                    if (index >= allLowerENGLetter.length) {
                        result += allLowerENGLetter[index - allLowerENGLetter.length];
                    } else if (index < 0){
                        result += allLowerENGLetter[allLowerENGLetter.length + index];
                    } else {
                        result += allLowerENGLetter[index];
                    }
                } else {
                    for (int j = 0; j < allLowerRUSLetter.length; j++) {
                        if (allLowerRUSLetter[j] == checkLetter) {
                            index = j - step;
                        }
                    }
                    if (index >= allLowerRUSLetter.length) {
                        result += allLowerRUSLetter[index - allLowerRUSLetter.length];
                    } else if (index < 0){
                        result += allLowerRUSLetter[allLowerRUSLetter.length + index];
                    } else {
                        result += allLowerRUSLetter[index];
                    }
                }
            } else {
                for (int j = 0; j < punctuationMarks.length; j++) {
                    if (punctuationMarks[j] == checkLetter) {
                        result += checkLetter;
                        break;
                    }
                }
            }
        }
        return result;
    }
}
