package CodeBasics;
class App {
    public static String truncate(String text, int length) {
        // BEGIN (write your solution here)
        var str = text.substring(0, length) + "...";
        return str;
        // END
    }
}