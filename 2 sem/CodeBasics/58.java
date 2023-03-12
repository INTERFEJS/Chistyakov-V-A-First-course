package CodeBasics;
class App {
    public static String reverse(String str) {
        // BEGIN (write your solution here)
        var i = str.length() - 1;
        var result = "";
        while (i >= 0) {
            result = result + str.charAt(i);
            i = i - 1;
        }

        return result;
        // END
    }
}