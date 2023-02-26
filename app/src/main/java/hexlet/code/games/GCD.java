package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    public static void announce() {
        System.out.println("Find the greatest common divisor of given numbers.");
    }

    public static String[] task(String[] pairQuestionAnswer) {
        int a1;
        int a2;
        a1 = (int) (Math.random() * Engine.ROUND);
        a2 = (int) (Math.random() * Engine.ROUND);
        pairQuestionAnswer[0] = a1 + " " + a2;
        if (Math.abs(a1) == 0 || Math.abs(a2) == 0) {
            pairQuestionAnswer[1] = "0";
            return pairQuestionAnswer;
        }
        if (Math.abs(a1) == 1 || Math.abs(a2) == 1) {
            pairQuestionAnswer[1] = "1";
            return pairQuestionAnswer;
        }
        if (Math.abs(a1) == Math.abs(a2)) {
            pairQuestionAnswer[1] = Integer.toString(a1);
            return pairQuestionAnswer;
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
        pairQuestionAnswer[1] = Integer.toString(nod);
        return pairQuestionAnswer;
    }
}
