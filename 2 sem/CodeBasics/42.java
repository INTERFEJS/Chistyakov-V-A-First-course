package CodeBasics;
class App {
    // BEGIN (write your solution here)
    public static String getHiddenCard(String num, int count) {
        return num.replace((num.substring(0, 12)), "*".repeat(count));
    }
    public static String getHiddenCard(String num) {
        return App.getHiddenCard(num, 4);
    }
    // END
}