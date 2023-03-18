package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Prime {
    static final String RULE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";  // правило игры
    static final int SCOPE_OF_RANDOM_TO_100 = 100;  // диапазон генерации случайного числа (до 100)
    static final int COUNT_OF_TESTS = 3;          // число попыток
    public static void gamePrime() {
        int randomNumber;                    // переменная для хранения случайного числа
        Random rnd = new Random();
        String[][] arrayQuestionsAnswers = new String[COUNT_OF_TESTS][2];
        for (int i = 0; (i < arrayQuestionsAnswers.length); i++) {
            randomNumber = rnd.nextInt(SCOPE_OF_RANDOM_TO_100);
            String answer = (isPrime(randomNumber) ? "yes" : "no");
            String question = Integer.toString(randomNumber);
            arrayQuestionsAnswers[i][0] = question;
            arrayQuestionsAnswers[i][1] = answer;
        }
        Engine.compareQuestionAnswer(RULE, arrayQuestionsAnswers);
    }

    public static boolean isPrime(int number) {
        final int firstNotPrime = 4;
        if (number == 0) {
            return false;
        }
        if (number < firstNotPrime) {
            return true;
        }
        for (int i = 2; i < number; i++) {
            if ((number % i) == 0) {
                return false;
            }
        }
        return true;
    }
}
