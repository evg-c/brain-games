package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GCD {

    public static void task() {
        String ruleOfGame = "Find the greatest common divisor of given numbers.";  // правило игры
        String username = Engine.startAndReceiveName(ruleOfGame);
        Random rnd = new Random();
        final int scopeOfRandomTo100 = 100;       // диапазон генерации случайного числа (до 100)
        final int countOfTests = 3;          // число попыток
        for (int i = 1; i <= countOfTests; i++) {
            int randomNumber1 = rnd.nextInt(scopeOfRandomTo100); // переменная для хранения случайного числа 1
            int randomNumber2 = rnd.nextInt(scopeOfRandomTo100); // переменная для хранения случайного числа 2
            String question = randomNumber1 + " " + randomNumber2;
            String answer = Integer.toString(findNod(randomNumber1, randomNumber2));
            if (!Engine.compareQuestionAnswer(question, answer)) {
                Engine.finish(username, false);
                return;
            }
        }
        Engine.finish(username, true);
    }

    public static int findNod(int number1, int number2) {
        if (anyNumberIs(0, number1, number2)) {
            return 0;
        }
        if (anyNumberIs(1, number1, number2)) {
            return 1;
        }
        if (Math.abs(number1) == Math.abs(number2)) {
            return number1;
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
    public static boolean anyNumberIs(int number, int a1, int a2) {
        return Math.abs(a1) == number || Math.abs(a2) == number;
    }
}
