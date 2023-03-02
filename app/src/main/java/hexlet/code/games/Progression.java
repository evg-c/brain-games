package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    public static void announce() {
        System.out.println("What number is missing in the progression?.");
    }

    public static String[] task(String[] pairQuestionAnswer) {
        final int minLenProgression = 5;   // минимальная длина прогрессии
        final int maxLenProgression = 10;  // максимальная длина прогрессии
        int lenProgression = minLenProgression + (int) (Math.random() * (maxLenProgression - minLenProgression));
        int positionProgression = 1 + (int) (Math.random() * (lenProgression - 1)); // генерация позиции от 1 до длины
        int startProgression = (int) (Math.random() * Engine.ROUND); // начальное число прогрессии от 0 до 100
        final int minStepProgression = 2;  // минимальный шаг прогрессии
        final int maxStepProgression = 10; // максимальный шаг прогрессии
        int stepProgression = minStepProgression + (int) (Math.random() * (maxStepProgression - minStepProgression));
        var resultString = new StringBuilder();
        int currentElement = startProgression;
        for (int i = 1; i <= lenProgression; i++) {
            if (i > 1) {
                currentElement = currentElement + stepProgression;
            }
            if (i == positionProgression) {
                resultString.append(".. ");
                pairQuestionAnswer[1] = Integer.toString(currentElement);
            } else {
                resultString.append(currentElement).append(" ");
            }
        }
        pairQuestionAnswer[0] = resultString.toString();
        return pairQuestionAnswer;
    }
}
