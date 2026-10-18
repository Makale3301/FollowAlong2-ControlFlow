package part08;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=5557s
//        starts at 1:32:37 — stop at about 1:36:20, before "if you would like a copy"
// Guide: GUIDE.md in this folder, steps 1–5
//
// Part 08 — for loops
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called ForLoops.
//    Leave the "package part08;" line and the class line alone. Type everything else.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.
import java.util.Scanner;
public class ForLoops {
    public static void main(String[] args) {
        // Counts down from 10 to 0
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
        // Prints when the countdown is done
        System.out.println("Happy New Year!");
        // Lets me type numbers
        Scanner scanner = new Scanner(System.in);
        // Asks how many times to print
        System.out.println("How many times?");
        // Saves my answer
        int times = scanner.nextInt();
        // Prints a message that many times
        for (int i = 0; i < times; i++) {
            System.out.println("Happy New Year!");
        }
        // Closes Scanner
        scanner.close();

    }
}
