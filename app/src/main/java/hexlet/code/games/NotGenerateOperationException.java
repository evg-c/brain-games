package hexlet.code.games;

public class NotGenerateOperationException extends Exception {
    public final String getQuestion() {
        return "2 * 2";
    }
    public final String getAnswer() {
        return "4";
    }
}
