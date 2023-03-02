package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    public static void announce() {
        System.out.println("Find the greatest common divisor of given numbers.");
    }

    public static String[] task(String[] pairQuestionAnswer) {
        int a1 = (int) (Math.random() * Engine.ROUND);  // генерация первого случайного числа
        int a2 = (int) (Math.random() * Engine.ROUND);  // генерация второго случайного числа
        pairQuestionAnswer[0] = a1 + " " + a2;
        if (Math.abs(a1) == Math.abs(a2)) {
            pairQuestionAnswer[1] = Integer.toString(a1);
            return pairQuestionAnswer;
        }
        pairQuestionAnswer[1] = Integer.toString(nod(a1, a2));
        return pairQuestionAnswer;
    }

    public static int nod(int a1, int a2) {
        if (anyNumberIs(0, a1, a2)) {
            return 0;
        }
        if (anyNumberIs(1, a1, a2)) {
            return 1;
        }
        int nod = 0;
        while ((Math.abs(a1) > 0) && (Math.abs(a2) > 0)) {
            if (Math.abs(a1) > Math.abs(a2)) {
                a1 = a1 % a2;
                if (a1 == 0) {
                    nod = a2;
                }
            }
            if ((Math.abs(a1) > 0) && (Math.abs(a2) > Math.abs(a1))) {
                a2 = a2 % a1;
                if (a2 == 0) {
                    nod = a1;
                }
            }
        }
        return nod;
    }
    public static boolean anyNumberIs(int number, int a1, int a2) {
        if (Math.abs(a1) == number || Math.abs(a2) == number) {
            return true;
        }
        return false;
    }
}
