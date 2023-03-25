package hexlet.code;

import java.util.Scanner;

public class Engine {
    static final int COUNT_TESTS = 3;          // число попыток

    public static void compareQuestionAnswer(String rule, String[][] arrQuestionsAnswers) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scan = new Scanner(System.in);
        String nameUser = scan.next();
        System.out.println("Hello, " + nameUser + "!");
        System.out.println(rule);
        boolean isSuccess = true;
        for (int i = 0; i < COUNT_TESTS; i++) {
            System.out.println("Question: " + arrQuestionsAnswers[i][0]);
            System.out.print("Your answer: ");
            String userAnswer = scan.next();
            if (userAnswer.trim().equals(arrQuestionsAnswers[i][1])) {
                System.out.println("Correct!");
            } else {
                String out = userAnswer + " is wrong answer ;(. Correct answer was " + arrQuestionsAnswers[i][1] + ".";
                System.out.println(out);
                isSuccess = false;
                break;
            }
        }
        if (isSuccess) {
            System.out.println("Congratulations, " + nameUser + "!");
        } else {
            System.out.println("Let's try again, " + nameUser + "!");
        }
        scan.close();
    }
}
