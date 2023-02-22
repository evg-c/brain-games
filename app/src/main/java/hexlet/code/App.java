package hexlet.code;

import java.util.Scanner;

public class App {
    //public static String gameNumber;
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");
        String gameNumber = userInput();
        System.out.println("Your choice: " + gameNumber);
        System.out.println(" ");
        Engine.general(gameNumber);
        //switch (gameNumber) {
        //    case ("1") -> Cli.greeting();
        //    case ("2") -> Even.evenGame();
        //    case ("3") -> Calc.calcGame();
        //    default -> { }
        //}

        //if (gameNumber.equals("1")) {
        //    Cli.greeting();
        //}
        //if (gameNumber.equals("2")) {
        //    String userName = Cli.greeting();
        //    if (Even.evenGame()) {
        //        System.out.println("Congratulations, " + userName);
        //    } else {
        //        System.out.println("Lets try again, " + userName);
        //    }
        //}
        //if (gameNumber.equals("3")) {
        //    String userName = Cli.greeting();
        //    if (Calc.calcGame()) {
        //        System.out.println("Congratulations, " + userName);
        //    } else {
        //        System.out.println("Lets try again, " + userName);
        //    }
        //}
    }
    public static String userInput() {
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }
}
