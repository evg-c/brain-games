package hexlet.code;

public class Cli {
    public static String greeting() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = App.userInput();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }
}
