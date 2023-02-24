package hexlet.code.games;
import hexlet.code.Engine;

public class Calc {
    public static void announce() {
        System.out.println("What is the result of the expression?");
    }

    public static String[] task(String[] pairQuestionAnswer) {
        int a1;
        int a2;
        int a3;
        int rez;
        final int prob = 4; // выдача выражения 2 * 2 и сравнение с 4 для непредвиденного случая
        a1 = (int) (Math.random() * Engine.ROUND);
        a2 = (int) (Math.random() * Engine.ROUND);
        a3 = (int) (Math.random() * Engine.ROUND2); // генерация случайного числа операции
        // 0 - это +
        // 1 - это -
        // 2 - это *
        switch (a3) {
            case 0 -> {
                pairQuestionAnswer[0] = a1 + " + " + a2;
                rez = a1 + a2;
            }
            case 1 -> {
                pairQuestionAnswer[0] = a1 + " - " + a2;
                rez = a1 - a2;
            }
            case 2 -> {
                pairQuestionAnswer[0] = a1 + " * " + a2;
                rez = a1 * a2;
            }
            default -> {
                pairQuestionAnswer[0] = "2 + 2";
                rez = prob;
            }
        }
        pairQuestionAnswer[1] = Integer.toString(rez);
        return pairQuestionAnswer;
    }
}
