package hexlet.code;
import hexlet.code.games.GameEven;
import hexlet.code.games.GameCalc;
import hexlet.code.games.GameGCD;
import hexlet.code.games.GameProgression;
import hexlet.code.games.GamePrime;

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
            case ("2") -> GameEven.gameEven();
            case ("3") -> GameCalc.gameCalc();
            case ("4") -> GameGCD.gameGCD();
            case ("5") -> GameProgression.gameProgression();
            case ("6") -> GamePrime.gamePrime();
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
