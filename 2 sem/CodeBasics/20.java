package CodeBasics;
class App {
    public static void main(String[] args) {
        var eurosCount = 100;

        // BEGIN (write your solution here)
        var dollarsCount = eurosCount * 1.25;
        System.out.println(dollarsCount);
        var rublesPerDollar = 60;
        var rublesCount = dollarsCount * rublesPerDollar;
        System.out.println(rublesCount);
        // END
    }
}