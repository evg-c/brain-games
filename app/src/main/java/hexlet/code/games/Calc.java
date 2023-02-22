package hexlet.code.games;
import hexlet.code.Engine;

public class Calc {
    public static void announce() {
        //Cli.greeting();
        System.out.println("What is the result of the expression?");
        //Engine.General();
    }

    public static String[] task(String[] pairQuestionAnswer) {
        //final int round = 100; // для получения целого случайного числа из double в диапазоне до 100
        //final int round2 = 3;  // для получения целого случайного числа из double в диапазоне до 3
        //final int count = 3;   // число попыток
        int a1;
        int a2;
        int a3;
        int rez;
        final int prob = 4; // выдача выражения 2 * 2 и сравнение с 4 для непредвиденного случая
        //String question;
        a1 = (int) (Math.random() * Engine.ROUND);
        a2 = (int) (Math.random() * Engine.ROUND);
        a3 = (int) (Math.random() * Engine.ROUND2); // генерация случайного числа операции
        // 0 - это +
        // 1 - это -
        // 2 - это *
        switch (a3) {
            case 0 -> {
                //Engine.question = a1 + " + " + a2;
                pairQuestionAnswer[0] = a1 + " + " + a2;
                rez = a1 + a2;
            }
            case 1 -> {
                //Engine.question = a1 + " - " + a2;
                pairQuestionAnswer[0] = a1 + " - " + a2;
                rez = a1 - a2;
            }
            case 2 -> {
                //Engine.question = a1 + " * " + a2;
                pairQuestionAnswer[0] = a1 + " * " + a2;
                rez = a1 * a2;
            }
            default -> {
                //Engine.question = "2 + 2";
                pairQuestionAnswer[0] = "2 + 2";
                rez = prob;
            }
        }
        //Engine.rightAnswer = Integer.toString(rez);
        pairQuestionAnswer[1] = Integer.toString(rez);
        return pairQuestionAnswer;
    }

            //System.out.println("Question: " + question);
            //System.out.print("Your answer: ");
            //String userAnswer = App.userInput();
            //if (userAnswer.trim().equals(Integer.toString(rez))) {
            //    System.out.println("Correct!");
            //} else {
            //    System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + rez + ".");
            //    return false;
            //}
        //}
        //return true;
    //}
}
