package hexlet.code;

public class Engine {
    public static final int ROUND = 100; // для получения целого случайного числа из double в диапазоне до 100
    public static final int ROUND2 = 3;  // для получения целого случайного числа из double в диапазоне до 3

    public static String startAndReceiveName(String start) {
        String nameUser = Cli.greeting();
        System.out.println(start);
        return nameUser;
    }

    public static boolean compareQuestionAnswer(String question, String answer) {
        boolean result;
        System.out.println("Question: " + question);
        System.out.print("Your answer: ");
        String userAnswer = App.userInput();
        if (userAnswer.trim().equals(answer)) {
            System.out.println("Correct!");
            result = true;
        } else {
            System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + answer + ".");
            result = false;
        }
        return result;
    }

    public static void finish(String username, boolean result) {
        if (result) {
            System.out.println("Congratulations, " + username + "!");
        } else {
            System.out.println("Let's try again, " + username + "!");
        }
    }
}
