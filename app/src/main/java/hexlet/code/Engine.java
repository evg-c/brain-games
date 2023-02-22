package hexlet.code;

public class Engine {
    //public static String question;
    public static final int ROUND = 100; // для получения целого случайного числа из double в диапазоне до 100
    public static final int ROUND2 = 3;  // для получения целого случайного числа из double в диапазоне до 3
    public static final int COUNT = 3;   // число попыток
    //public static String rightAnswer;
    public static void general(String gameNumber) {
        //Cli.greeting();
        String userName = "";
        if (gameNumber.equals("0")) {
            return;
        }
        if (Integer.parseInt(gameNumber) > 0) {
            userName = Cli.greeting();
        }
        if (gameNumber.equals("1")) {
            return;
        }
        boolean result = true;
        switch (gameNumber) {
            case ("2") -> Even.announce();
            case ("3") -> Calc.announce();
            default -> { }
        }
        String[] pairQuestionAnswer = new String[2];
        for (int i = 1; ((i <= COUNT) && (result)); i++) {
            switch (gameNumber) {
                case ("2") -> Even.task(pairQuestionAnswer);
                case ("3") -> Calc.task(pairQuestionAnswer);
                default -> { }
            }
            //System.out.println("Question: " + Engine.question);
            System.out.println("Question: " + pairQuestionAnswer[0]);
            System.out.print("Your answer: ");
            String userAnswer = App.userInput();
            //if (userAnswer.trim().equals(Engine.rightAnswer)) {
            if (userAnswer.trim().equals(pairQuestionAnswer[1])) {
                System.out.println("Correct!");
            } else {
                //String longOut = userAnswer + " is wrong answer ;(. Correct answer was " + Engine.rightAnswer + ".";
                String longOut = userAnswer + " is wrong answer ;(. Correct answer was " + pairQuestionAnswer[1] + ".";
                System.out.println(longOut);
                result = false;
            }
        }
        if (result) {
            System.out.println("Congratulations, " + userName);
        } else {
            System.out.println("Lets try again, " + userName);
        }
    }
}
