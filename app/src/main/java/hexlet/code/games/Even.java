package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;

public class Even {
    public static void task() {
        String ruleOfGame = "Answer 'yes' if the number is even, otherwise answer 'no'.";  // правило игры
        String userName = Engine.startAndReceiveName(ruleOfGame);
        Random rnd = new Random();
        int randomNumber;                    // переменная для хранения случайного числа
        final int scopeOfRandomTo100 = 100;  // диапазон генерации случайного числа (до 100)
        final int countOfTests = 3;          // число попыток
        for (int i = 1; i <= countOfTests; i++) {
            randomNumber = rnd.nextInt(scopeOfRandomTo100);
            String question = Integer.toString(randomNumber);
            String answer = (isEven(randomNumber) ? "yes" : "no");
            if (!Engine.compareQuestionAnswer(question, answer)) {
                Engine.finish(userName, false);
                return;
            }
        }
        Engine.finish(userName, true);
    }

    public static boolean isEven(int number) {
        return (number % 2) == 0;
    }
}
