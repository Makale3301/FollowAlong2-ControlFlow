package part07;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4843s
//        logical operators start at about 80:43 — stop at about 87:47
// Guide: GUIDE.md in this folder, steps 1–6
//
// Part 07 — the logical operators: && (and), || (or), ! (not)
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called LogicalOperators.
//    Leave the "package part07;" line and the "public class LogicalOperators" line alone.
//    The import line goes BETWEEN them (the guide shows where).
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.
import java.util.Scanner;
public class LogicalOperators {
    public static void main(String[] args) {
        // Lets me type answers
        Scanner scanner = new Scanner(System.in);
        // My temperature
        int temp = 25;
        // Checks if the temperature is between 20 and 30
        if (temp >= 20 && temp <= 30) {
            System.out.println("It is warm outside!");
        } else {
            System.out.println("It is not warm outside!");
        }
        // Asks if I want to quit
        System.out.println("You are playing a game! Press q or Q to quit");
        // Gets my answer
        String response = scanner.nextLine();
        // Checks if I want to keep playing
        if (!response.equals("q") && !response.equals("Q")) {
            System.out.println("You are still playing the game");
        } else {
            System.out.println("You quit the game");
        }
        // Closes Scanner
        scanner.close();

    }
}
