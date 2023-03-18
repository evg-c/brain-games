package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Progression {
    static final String RULE_OF_GAME = "What number is missing in the progression?";  // правило игры
    static final int MIN_LENGTH_PROGRESSION = 5;   // минимальная длина прогрессии
    static final int MAX_LENGTH_PROGRESSION = 10;  // максимальная длина прогрессии
    static final int SCOPE_OF_RANDOM_TO_100 = 100; // диапазон генерации случайного числа (до 100)
    static final int MIN_STEP_PROGRESSION = 2;     // минимальный шаг прогрессии
    static final int MAX_STEP_PROGRESSION = 10;    // максимальный шаг прогрессии
    static final int COUNT_OF_TESTS = 3;           // число попыток
    public static void gameProgression() {
        Random rnd = new Random();
        String[][] arrayQuestionsAnswers = new String[COUNT_OF_TESTS][2];
        for (int i = 0; (i < arrayQuestionsAnswers.length); i++) {
            int lengthProgression = rnd.nextInt(MIN_LENGTH_PROGRESSION, MAX_LENGTH_PROGRESSION);  // генерация длины
            int positionProgression = rnd.nextInt(1,  lengthProgression);  // генерация позиции от 1 до длины
            int startProgression = rnd.nextInt(SCOPE_OF_RANDOM_TO_100); // генерация начального числа прогрессии
            int stepProgression = rnd.nextInt(MIN_STEP_PROGRESSION, MAX_STEP_PROGRESSION); // генерация шага прогрессии
            int[] arrayProgression;
            arrayProgression = createProgression(startProgression, lengthProgression, stepProgression);
            arrayQuestionsAnswers[i][0] = createQuestion(arrayProgression, positionProgression);
            arrayQuestionsAnswers[i][1] = Integer.toString(arrayProgression[positionProgression - 1]);
        }
        Engine.compareQuestionAnswer(RULE_OF_GAME, arrayQuestionsAnswers);
    }
    public static int[] createProgression(int startProgression, int lengthProgression, int step) {
        int[] progression = new int[lengthProgression];
        progression[0] = startProgression;
        int currentElementProgression = progression[0];
        for (int i = 1; i < progression.length; i++) {
            currentElementProgression = currentElementProgression + step;
            progression[i] = currentElementProgression;
        }
        return progression;
    }
    public static String createQuestion(int[] arrayProgression, int position) {
        var stringQuestion = new StringBuilder();
        for (int j = 0; j < arrayProgression.length; j++) {
            if (j == (position - 1)) {
                stringQuestion.append(".. ");
            } else {
                stringQuestion.append(arrayProgression[j]).append(" ");
            }
        }
        return stringQuestion.toString();
    }
}
