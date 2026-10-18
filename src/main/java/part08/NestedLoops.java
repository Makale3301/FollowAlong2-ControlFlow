package part08;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=5836s
//        starts at 1:37:16 — stop at about 1:42:48, at "well ladies and gentlemen"
// Guide: GUIDE.md in this folder, steps 6–10
//
// Part 08 — nested loops (a loop inside another loop)
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called NestedLoops.
//    Leave the "package part08;" line and the class line alone. Type everything else.
//    When you type Scanner, IntelliJ will want an import. See the README.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.
import java.util.Scanner;
public class NestedLoops {
    public static void main(String[] args) {
        // Lets me type numbers
        Scanner scanner = new Scanner(System.in);
        // Asks how many rows
        System.out.println("Enter number of rows:");
        int rows = scanner.nextInt();
        // Asks how many columns
        System.out.println("Enter number of columns:");
        int columns = scanner.nextInt();
        // Asks what symbol to use
        System.out.println("Enter symbol to use:");
        String symbol = scanner.next();
        // Controls how many rows there are
        for (int i = 1; i <= rows; i++) {
            // Controls how many symbols are in each row
            for (int j = 1; j <= columns; j++) {
                // Prints the symbol on the same line
                System.out.print(symbol);
            }
            // Moves to the next row
            System.out.println();
        }
        // Closes Scanner
        scanner.close();

    }
}
