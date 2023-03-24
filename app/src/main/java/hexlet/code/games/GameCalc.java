package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;

public class GameCalc {
    static final String RULE_OF_GAME = "What is the result of the expression?";  // правило игры
    static final int SCOPE_OF_RANDOM_TO_100 = 100;                   // диапазон генерации случайного числа (до 100)
    static final int COUNT_OF_TESTS = 3;                             // число попыток
    static final String[] ARRAY_OF_OPERATION = {"+", "-", "*"};      // для генерации случайного типа операции

    public static void gameCalc() {
        Random rnd = new Random();
        String[][] arrayQuestionsAnswers = new String[COUNT_OF_TESTS][2];
        String question;
        String answer;
        for (int i = 0; (i < arrayQuestionsAnswers.length); i++) {
            int randomNum1 = rnd.nextInt(SCOPE_OF_RANDOM_TO_100);      // переменная для хранения случайного числа 1
            int randomNum2 = rnd.nextInt(SCOPE_OF_RANDOM_TO_100);      // переменная для хранения случайного числа 2
            int randomNum3 = rnd.nextInt(ARRAY_OF_OPERATION.length);   // для генерации случайного типа операции
            try {
                question = randomNum1 + " " + ARRAY_OF_OPERATION[randomNum3] + " " + randomNum2;
            } catch (ArrayIndexOutOfBoundsException ex) {
                question = ex.getMessage();
            }
            try {
                answer = Integer.toString(generateAnswer(randomNum1, randomNum2, ARRAY_OF_OPERATION[randomNum3]));
            } catch (RuntimeException ex) {
                answer = ex.getMessage();
            }
            arrayQuestionsAnswers[i][0] = question;
            arrayQuestionsAnswers[i][1] = answer;
        }
        Engine.compareQuestionAnswer(RULE_OF_GAME, arrayQuestionsAnswers);
    }

    public static int generateAnswer(int number1, int number2, String number3) throws RuntimeException {
        int resultOperation;
        switch (number3) {
            case "+" -> {
                resultOperation = number1 + number2;
            }
            case "-" -> {
                resultOperation = number1 - number2;
            }
            case "*" -> {
                resultOperation = number1 * number2;
            }
            default -> {
                throw new RuntimeException();
            }
        }
        return resultOperation;
    }
}
