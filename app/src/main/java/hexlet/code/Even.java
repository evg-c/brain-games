package hexlet.code;
public class Even {
    public static void announce() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        //Engine.General();
    }
     //   final int round = 100; //для получения целого числа из double в диапазоне до 100
       // final int count = 3;   //число попыток

    public static String[] task(String[] pairQuestionAnswer) {
        int a1;
        //for (int i = 1; i <= Engine.count; i++) {
        a1 = (int) (Math.random() * Engine.ROUND);
        //Engine.question = Integer.toString(a1);
        pairQuestionAnswer[0] = Integer.toString(a1);
        if ((a1 % 2) == 0) {
            //Engine.rightAnswer = "yes";
            pairQuestionAnswer[1] = "yes";
        } else {
            //Engine.rightAnswer = "no";
            pairQuestionAnswer[1] = "no";
        }
        return pairQuestionAnswer;
    }
            //System.out.println("Question: " + a1);
            //System.out.print("Your answer: ");
            //String userAnswer = App.userInput();
            //if (((a1 % 2 == 0) && (userAnswer.equals("yes"))) || ((a1 % 2 != 0) && (userAnswer.equals("no")))) {
              //  System.out.println("Correct!");
            //} else {
            //    System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
            //    return false;
            //}
        //}
        //return true;
    //}
}
