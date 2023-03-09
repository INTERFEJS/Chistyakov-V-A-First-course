package CodeBasics;

class App {
    public static void main(String[] args) {
        var king = "King Balon the 6th";

        // BEGIN (write your solution here)
        var numberOfAncestors = 6;
        var roomsInTheCastle = 17;
        System.out.println(king + " has " + (numberOfAncestors * roomsInTheCastle) + " rooms.");
        // END
    }
}