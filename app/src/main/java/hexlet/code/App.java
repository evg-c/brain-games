package hexlet.code;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        String gameNumber = userInput();
        System.out.println("Your choice: " + gameNumber);
        System.out.println(" ");
        switch (gameNumber) {
            case ("1") -> Cli.greeting();
            case ("2") -> Even.task();
            case ("3") -> Calc.task();
            case ("4") -> GCD.task();
            case ("5") -> Progression.task();
            case ("6") -> Prime.task();
            default -> {
                return;
            }
        }
    }
    public static String userInput() {
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }
}
