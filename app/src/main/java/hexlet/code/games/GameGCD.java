package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class GameGCD {
    static final String RULE_OF_GAME = "Find the greatest common divisor of given numbers.";  // правило игры
    static final int SCOPE_OF_RANDOM_TO_100 = 100;       // диапазон генерации случайного числа (до 100)
    static final int COUNT_OF_TESTS = 3;          // число попыток

    public static void gameGCD() {
        Random rnd = new Random();
        String[][] arrayQuestionsAnswers = new String[COUNT_OF_TESTS][2];
        for (int i = 0; (i < arrayQuestionsAnswers.length); i++) {
            int randomNumber1 = rnd.nextInt(SCOPE_OF_RANDOM_TO_100); // переменная для хранения случайного числа 1
            int randomNumber2 = rnd.nextInt(SCOPE_OF_RANDOM_TO_100); // переменная для хранения случайного числа 2
            String question = randomNumber1 + " " + randomNumber2;
            String answer = Integer.toString(findGCD(randomNumber1, randomNumber2));
            arrayQuestionsAnswers[i][0] = question;
            arrayQuestionsAnswers[i][1] = answer;
        }
        Engine.compareQuestionAnswer(RULE_OF_GAME, arrayQuestionsAnswers);
    }

    public static int findGCD(int number1, int number2) {
        switch (number1) {
            case (0) -> {
                return number2;
            }
            case (1) -> {
                return 1;
            }
            default -> { }
        }
        if (Math.abs(number1) == Math.abs(number2)) {
            return number1;
        }
        switch (number2) {
            case (0) -> {
                return number1;
            }
            case (1) -> {
                return 1;
            }
            default -> { }
        }
        int nod = 0;
        while ((Math.abs(number1) > 0) && (Math.abs(number2) > 0)) {
            if (Math.abs(number1) > Math.abs(number2)) {
                number1 = number1 % number2;
                if (number1 == 0) {
                    nod = number2;
                }
            }
            if ((Math.abs(number1) > 0) && (Math.abs(number2) > Math.abs(number1))) {
                number2 = number2 % number1;
                if (number2 == 0) {
                    nod = number1;
                }
            }
        }
        return nod;
    }
}
