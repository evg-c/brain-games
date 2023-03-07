package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Progression {
    public static void task() {
        String ruleOfGame = "What number is missing in the progression?";  // правило игры
        String username = Engine.startAndReceiveName(ruleOfGame);
        Random rnd = new Random();
        final int minLengthProgression = 5;   // минимальная длина прогрессии
        final int maxLengthProgression = 10;  // максимальная длина прогрессии
        final int scopeOfRandomTo100 = 100;   // диапазон генерации случайного числа (до 100)
        final int minStepProgression = 2;     // минимальный шаг прогрессии
        final int maxStepProgression = 10;    // максимальный шаг прогрессии
        final int countOfTests = 3;           // число попыток
        for (int i = 1; i <= countOfTests; i++) {
            int lengthProgression = rnd.nextInt(minLengthProgression, maxLengthProgression);  // генерация длины
            int positionProgression = rnd.nextInt(1,  lengthProgression);  // генерация позиции от 1 до длины
            int startProgression = rnd.nextInt(scopeOfRandomTo100); // генерация начального числа прогрессии
            int stepProgression = rnd.nextInt(minStepProgression, maxStepProgression); // генерация шага прогрессии
            String answer = "";
            var resultString = new StringBuilder();
            int currentElement = startProgression;
            for (int j = 1; j <= lengthProgression; j++) {
                if (j > 1) {
                    currentElement = currentElement + stepProgression;
                }
                if (j == positionProgression) {
                    resultString.append(".. ");
                    answer = Integer.toString(currentElement);
                } else {
                    resultString.append(currentElement).append(" ");
                }
            }
            String question = resultString.toString();
            if (!Engine.compareQuestionAnswer(question, answer)) {
                Engine.finish(username, false);
                return;
            }
        }
        Engine.finish(username, true);
    }
}
