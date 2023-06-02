package Num19;

public class Main {

    static int calculateFunction(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n % 2 == 0) {
            return calculateFunction(n / 2);
        } else {
            return calculateFunction(n / 2) + calculateFunction(n / 2 + 1);
        }
    }

    public static void main(String[] args) {
        int n = 10;
        int result = calculateFunction(n);
        System.out.println("Funct(" + n + ") = " + result);
    }
}
