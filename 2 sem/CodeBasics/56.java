package CodeBasics;
class App {
    public static void printReversedNameBySymbol(String name) {
        // BEGIN (write your solution here)
         var i = name.length() - 1;
        while (i >= 0) {
            System.out.println(name.charAt(i));
            i = i - 1;
        }
        // END
    }
}