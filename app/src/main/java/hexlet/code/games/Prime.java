package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {
    public static void task() {
        String ruleOfGame = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";  // правило игры
        String username = Engine.startAndReceiveName(ruleOfGame);
        Random rnd = new Random();
        int randomNumber;                    // переменная для хранения случайного числа
        final int scopeOfRandomTo100 = 100;  // диапазон генерации случайного числа (до 100)
        final int countOfTests = 3;          // число попыток
        for (int i = 1; i <= countOfTests; i++) {
            randomNumber = rnd.nextInt(scopeOfRandomTo100);
            String question = Integer.toString(randomNumber);
            String answer = (isPrime(randomNumber) ? "yes" : "no");
            if (!Engine.compareQuestionAnswer(question, answer)) {
                Engine.finish(username, false);
                return;
            }
        }
        Engine.finish(username, true);
    }
    public static boolean isPrime(int number) {
        final int firstNotPrime = 4;
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
