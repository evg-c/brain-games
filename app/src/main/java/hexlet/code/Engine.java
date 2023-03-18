package hexlet.code;

public class Engine {
    static final int COUNT_TESTS = 3;          // число попыток
    public static void compareQuestionAnswer(String rule, String[][] arrQuestionsAnswers) {
        String nameUser = Cli.greeting();
        System.out.println(rule);
        boolean result = true;
        for (int i = 0; i < COUNT_TESTS; i++) {
            System.out.println("Question: " + arrQuestionsAnswers[i][0]);
            System.out.print("Your answer: ");
            String userAnswer = App.userInput();
            if (userAnswer.trim().equals(arrQuestionsAnswers[i][1])) {
                System.out.println("Correct!");
            } else {
                String out = userAnswer + " is wrong answer ;(. Correct answer was " + arrQuestionsAnswers[i][1] + ".";
                System.out.println(out);
                result = false;
                break;
            }
        }
        if (result) {
            System.out.println("Congratulations, " + nameUser + "!");
        } else {
            System.out.println("Let's try again, " + nameUser + "!");
        }
    }
}
