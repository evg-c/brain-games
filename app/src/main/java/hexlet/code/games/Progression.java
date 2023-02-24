package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    public static void announce() {
        System.out.println("What number is missing in the progression?.");
    }

    public static String[] task(String[] pairQuestionAnswer) {
        int lenProgression;                             // длина прогрессии
        final int minLen = 5;
        final int maxLen = 10;
        lenProgression = minLen + (int) (Math.random() * (maxLen - minLen)); // генерация случайного числа от 5 до 10
        int positionProgression;                           // позиция в прогрессии
        positionProgression = 1 + (int) (Math.random() * (lenProgression - 1)); // число от 1 до длины прогрессии
        int startProgression;                                   // начальное число прогрессии
        startProgression = (int) (Math.random() * Engine.ROUND); // генерация случайного числа от 0 до 100
        int stepProgression;                             // шаг прогрессии
        final int minStep = 2;
        final int maxStep = 10;
        stepProgression = minStep + (int) (Math.random() * (maxStep - minStep)); // генерация числа от 2 до 10
        var resultString = new StringBuilder();
        //resultString.append(startProgression);
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
