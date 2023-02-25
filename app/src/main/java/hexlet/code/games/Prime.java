package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static void announce() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }

    public static String[] task(String[] pairQuestionAnswer) {
        int randomNumber;
        final int firstNotPrime = 4;
        randomNumber = (int) (Math.random() * Engine.ROUND); // генерация случайного числа от 0 до 100
        pairQuestionAnswer[0] = Integer.toString(randomNumber);
        if (randomNumber < firstNotPrime) {
            pairQuestionAnswer[1] = "no";
            return pairQuestionAnswer;
        }
        for (int i = 2; i < randomNumber; i++) {
            if ((randomNumber % i) == 0) {
                pairQuestionAnswer[1] = "no";
                return pairQuestionAnswer;
            }
        }
        pairQuestionAnswer[1] = "yes";
        return pairQuestionAnswer;
    }
}
