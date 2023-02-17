package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("0 - Exit");
        int gameNumber = sc.nextInt();
        System.out.println("Your choice: " + gameNumber);
        System.out.println(" ");
        if (gameNumber == 1) {
            System.out.println("Welcome to the Brain Games!");
            String user = Cli.greeting();
        }
    }
}
