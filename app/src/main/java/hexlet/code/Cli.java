package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static String Greeting() {
        Scanner sc = new Scanner(System.in);
        System.out.print("May i have your name? ");
        String userName = sc.next();
        System.out.println("Hello, " + userName + "!");
        sc.close();
        return userName;
    }
}
