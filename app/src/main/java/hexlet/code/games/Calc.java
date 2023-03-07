package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    public static void task() {
        String ruleOfGame = "What is the result of the expression?";  // правило игры
        String username = Engine.startAndReceiveName(ruleOfGame);
        Random rnd = new Random();
        final int scopeOfRandomTo100 = 100;  // диапазон генерации случайного числа (до 100)
        final int countOfTests = 3;          // число попыток
        final int scopeOfRandomTo3 = 3;      // диапазон генерации случайного числа (до 3)
        for (int i = 1; i <= countOfTests; i++) {
            int randomNumber1 = rnd.nextInt(scopeOfRandomTo100); // переменная для хранения случайного числа 1
            int randomNumber2 = rnd.nextInt(scopeOfRandomTo100); // переменная для хранения случайного числа 2
            int randomNumber3 = rnd.nextInt(scopeOfRandomTo3);   // переменная для хранения случайного типа операции
            // 0 - это +
            // 1 - это -
            // 2 - это *
            String question1 = generateQuestion(randomNumber1, randomNumber2, randomNumber3);
            String answer = Integer.toString(generateAnswer(randomNumber1, randomNumber2, randomNumber3));
            if (!Engine.compareQuestionAnswer(question1, answer)) {
                Engine.finish(username, false);
                return;
            }
        }
        Engine.finish(username, true);
    }

    public static String generateQuestion(int number1, int number2, int number3) {
        String question;
        switch (number3) {
            case 0 -> {
                question = number1 + " + " + number2;
            }
            case 1 -> {
                question = number1 + " - " + number2;
            }
            case 2 -> {
                question = number1 + " * " + number2;
            }
            default -> {
                question = "2 + 2";
            }
        }
        return question;
    }
    public static int generateAnswer(int number1, int number2, int number3) {
        int resultOperation;
        final int prob = 4;                  // выдача выражения 2 * 2 и сравнение с 4 для непредвиденного случая
        switch (number3) {
            case 0 -> {
                resultOperation = number1 + number2;
            }
            case 1 -> {
                resultOperation = number1 - number2;
            }
            case 2 -> {
                resultOperation = number1 * number2;
            }
            default -> {
                resultOperation = prob;
            }
        }
        return resultOperation;
    }
}
