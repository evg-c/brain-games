package hexlet.code;

public class Cli {
    public static String greeting() {
        System.out.print("May i have your name? ");
        String userName = App.userInput();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }
}
