package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int gameNumber = 0;
        String userName = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        if (sc.hasNextInt()) {
            gameNumber = sc.nextInt();
        }
        sc.nextLine();
        System.out.println("Your choice: " + gameNumber);
        System.out.println(" ");
        if (gameNumber == 1) {
            System.out.println("Welcome to the Brain Games!");
            userName = Cli.greeting();
        }
        if (gameNumber == 2) {
            Cli.greeting();
            if (Even.evenGame()) {
                System.out.println("Congratulations, " + userName);
            } else {
                System.out.println("Lets try again, " + userName);
            }
        }
    }
}
