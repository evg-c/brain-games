package hexlet.code.games;
import hexlet.code.Engine;
public class Even {
    public static void announce() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }

    public static String[] task(String[] pairQuestionAnswer) {
        int a1;
        a1 = (int) (Math.random() * Engine.ROUND);
        pairQuestionAnswer[0] = Integer.toString(a1);
        if ((a1 % 2) == 0) {
            pairQuestionAnswer[1] = "yes";
        } else {
            pairQuestionAnswer[1] = "no";
        }
        return pairQuestionAnswer;
    }
}
