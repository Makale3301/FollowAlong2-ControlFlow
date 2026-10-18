package part08;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=5591s
//        rewatch 1:33:11–1:36:00 for the three parts of a for loop
// Guide: GUIDE.md in this folder, steps 2–5 and 8
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.
import java.util.Scanner;
public class Stretch {
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
