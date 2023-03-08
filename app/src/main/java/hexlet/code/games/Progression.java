package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Progression {
    public static void task() {
        String ruleOfGame = "What number is missing in the progression?";  // правило игры
        String username = Engine.startAndReceiveName(ruleOfGame);
        final int minLengthProgression = 5;   // минимальная длина прогрессии
        final int maxLengthProgression = 10;  // максимальная длина прогрессии
        final int scopeOfRandomTo100 = 100;   // диапазон генерации случайного числа (до 100)
        final int minStepProgression = 2;     // минимальный шаг прогрессии
        final int maxStepProgression = 10;    // максимальный шаг прогрессии
        final int countOfTests = 3;           // число попыток
        Random rnd = new Random();
        for (int i = 1; i <= countOfTests; i++) {
            int lengthProgression = rnd.nextInt(minLengthProgression, maxLengthProgression);  // генерация длины
            int positionProgression = rnd.nextInt(1,  lengthProgression);  // генерация позиции от 1 до длины
            int startProgression = rnd.nextInt(scopeOfRandomTo100); // генерация начального числа прогрессии
            int stepProgression = rnd.nextInt(minStepProgression, maxStepProgression); // генерация шага прогрессии
            String[] pairQA;
            pairQA = createProgression(startProgression, lengthProgression, stepProgression, positionProgression);
            if (!Engine.compareQuestionAnswer(pairQA[0], pairQA[1])) {
                Engine.finish(username, false);
                return;
            }
        }
        Engine.finish(username, true);
    }
    public static String[] createProgression(int startProgression, int lengthProgression, int step, int pos) {
        // step - шаг прогрессии
        // pos  - позиция в прогрессии, которую надо заполнить
        var progression = new StringBuilder();    // строка создаваемой прогрессии
        // текущий элемент прогрессии
        int currentElementProgression = startProgression;
        // пара вопрос - ответ, которую надо сформировать
        String[] questionAnswer = new String[2];
        for (int j = 1; j <= lengthProgression; j++) {
            if (j > 1) {
                currentElementProgression = currentElementProgression + step;
            }
            if (j == pos) {
                progression.append(".. ");
                questionAnswer[1] = Integer.toString(currentElementProgression);
            } else {
                progression.append(currentElementProgression).append(" ");
            }
        }
        questionAnswer[0] = progression.toString();
        return questionAnswer;
    }
}
