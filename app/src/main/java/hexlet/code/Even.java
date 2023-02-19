package hexlet.code;

import java.util.Scanner;

public class Even {
    public static boolean evenGame() {
        Scanner scEven = new Scanner(System.in);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        final int round = 100; //для получения целого числа из double
        int a1 = (int) (Math.random() * round);
        System.out.println("Question: " + a1);
        System.out.print("Your answer: ");
        String userAnswer = App.userInput();
        System.out.println();
        if (((a1 % 2 == 0) && (userAnswer.equals("yes"))) || ((a1 % 2 != 0) && (userAnswer.equals("no")))) {
            System.out.println("Correct!");
        } else {
            System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
            return false;
        }
        return true;
    }
}
