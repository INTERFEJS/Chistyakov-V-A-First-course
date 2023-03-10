package CodeBasics;
class App {
    public static void main(String[] args) {
        var emoji = "-(";
        // BEGIN (write your solution here)
        emoji = emoji.replace("(", ")");
        emoji = ":" + emoji;
        System.out.println(emoji);
        // END
    }
}
