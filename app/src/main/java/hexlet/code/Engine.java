package hexlet.code;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class Engine {
    public static final int ROUND = 100; // для получения целого случайного числа из double в диапазоне до 100
    public static final int ROUND2 = 3;  // для получения целого случайного числа из double в диапазоне до 3
    public static final int COUNT = 3;   // число попыток
    public static void general(String gameNumber) {
        String userName = "";
        if (gameNumber.equals("0")) {
            return;
        }
        if (Integer.parseInt(gameNumber) > 0) {
            userName = Cli.greeting();
        }
        if (gameNumber.equals("1")) {
            return;
        }
        boolean result = true;
        switch (gameNumber) {
            case ("2") -> Even.announce();
            case ("3") -> Calc.announce();
            case ("4") -> GCD.announce();
            case ("5") -> Progression.announce();
            case ("6") -> Prime.announce();
            default -> { }
        }
        String[] pairQuestionAnswer = new String[2];
        for (int i = 1; ((i <= COUNT) && (result)); i++) {
            switch (gameNumber) {
                case ("2") -> Even.task(pairQuestionAnswer);
                case ("3") -> Calc.task(pairQuestionAnswer);
                case ("4") -> GCD.task(pairQuestionAnswer);
                case ("5") -> Progression.task(pairQuestionAnswer);
                case ("6") -> Prime.task(pairQuestionAnswer);
                default -> { }
            }
            System.out.println("Question: " + pairQuestionAnswer[0]);
            System.out.print("Your answer: ");
            String userAnswer = App.userInput();
            if (userAnswer.trim().equals(pairQuestionAnswer[1])) {
                System.out.println("Correct!");
            } else {
                String longOut = userAnswer + " is wrong answer ;(. Correct answer was " + pairQuestionAnswer[1] + ".";
                System.out.println(longOut);
                result = false;
            }
        }
        if (result) {
            System.out.println("Congratulations, " + userName + "!");
        } else {
            System.out.println("Let's try again, " + userName + "!");
        }
    }
}
