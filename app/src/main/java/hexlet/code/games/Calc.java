package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    static final String RULE_OF_GAME = "What is the result of the expression?";  // правило игры
    static final int SCOPE_OF_RANDOM_TO_100 = 100;  // диапазон генерации случайного числа (до 100)
    static final int COUNT_OF_TESTS = 3;          // число попыток
    static final int SCOPE_OF_RANDOM_TO_3 = 3;      // диапазон генерации случайного числа (до 3)
    public static void gameCalc() {
        Random rnd = new Random();
        String[][] arrayQuestionsAnswers = new String[COUNT_OF_TESTS][2];
        String question;
        String answer;
        for (int i = 0; (i < arrayQuestionsAnswers.length); i++) {
            int randomNumber1 = rnd.nextInt(SCOPE_OF_RANDOM_TO_100); // переменная для хранения случайного числа 1
            int randomNumber2 = rnd.nextInt(SCOPE_OF_RANDOM_TO_100); // переменная для хранения случайного числа 2
            int randomNumber3 = rnd.nextInt(SCOPE_OF_RANDOM_TO_3);   // переменная для хранения случайного типа операции
            // 0 это +     1 это -      2 это *
            try {
                question = generateQuestion(randomNumber1, randomNumber2, randomNumber3);
            } catch (NotGenerateOperationException ex) {
                question = ex.getQuestion();
            }
            try {
                answer = Integer.toString(generateAnswer(randomNumber1, randomNumber2, randomNumber3));
            } catch (NotGenerateOperationException ex) {
                answer = ex.getAnswer();
            }
            arrayQuestionsAnswers[i][0] = question;
            arrayQuestionsAnswers[i][1] = answer;
        }
        Engine.compareQuestionAnswer(RULE_OF_GAME, arrayQuestionsAnswers);
    }

    public static String generateQuestion(int number1, int number2, int number3) throws NotGenerateOperationException {
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
                throw new NotGenerateOperationException();
            }
        }
        return question;
    }

    public static int generateAnswer(int number1, int number2, int number3) throws NotGenerateOperationException {
        int resultOperation;
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
                throw new NotGenerateOperationException();
            }
        }
        return resultOperation;
    }
}
