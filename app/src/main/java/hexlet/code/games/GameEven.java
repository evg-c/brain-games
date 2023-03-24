package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;

public class GameEven {
    static final String RULE_OF_GAME = "Answer 'yes' if the number is even, otherwise answer 'no'.";  // правило игры
    static final int SCOPE_OF_RANDOM_TO_100 = 100;  // диапазон генерации случайного числа (до 100)
    static final int COUNT_OF_TESTS = 3;          // число попыток

    public static void gameEven() {
        Random rnd = new Random();
        int randomNumber;                    // переменная для хранения случайного числа
        String[][] arrayQuestionsAnswers = new String[COUNT_OF_TESTS][2];
        for (int i = 0; (i < arrayQuestionsAnswers.length); i++) {
            randomNumber = rnd.nextInt(SCOPE_OF_RANDOM_TO_100);
            String question = Integer.toString(randomNumber);
            String answer = (isEven(randomNumber) ? "yes" : "no");
            arrayQuestionsAnswers[i][0] = question;
            arrayQuestionsAnswers[i][1] = answer;
        }
        Engine.compareQuestionAnswer(RULE_OF_GAME, arrayQuestionsAnswers);
    }

    public static boolean isEven(int number) {
        return (number % 2) == 0;
    }
}
