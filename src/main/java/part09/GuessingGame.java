package part09;

// Part 09 — CHECKPOINT. No video in this part.
// Video (only if you need a reminder): https://www.youtube.com/watch?v=xk4_1vDrzzo
//   user input (Scanner) — part 03 · random numbers — part 05
//   if statements — part 06 · while loops — part 07
//
// SECTION A — BUILD: write a number guessing game in this class, starting from nothing.
//    The README has the full list of rules and a sample run.
//    Leave the "package part09;" line and the class line alone. Type everything else,
//    including main and the import lines.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does.
import java.util.Scanner;
import java.util.Random;
public class GuessingGame {
    public static void main(String[] args) {
        // Lets the user type guesses
        Scanner scanner = new Scanner(System.in);
        // Makes random numbers
        Random random = new Random();
        // Picks a random number from 1 to 100
        int secret = random.nextInt(100) + 1;
        // Starts my guess at 0
        int guess = 0;
        // Keeps track of my guesses
        int count = 0;
        // Tells the player what to do
        System.out.println("I'm thinking of a number between 1 and 100.");
        // Keeps going until the answer is right
        while (guess != secret) {
            // Asks for a guess
            System.out.print("Your guess: ");
            // Gets the number the player typed
            guess = scanner.nextInt();
            // Adds one to the guess count
            count++;
            // Checks if the guess is too high
            if (guess > secret) {
                System.out.println("Too high!");
                // Checks if the guess is too low
            } else if (guess < secret) {
                System.out.println("Too low!");
            }
        }
        // Prints the result when the player wins
        System.out.println("Correct! You got it in " + count + " guesses.");
        // Closes Scanner
        scanner.close();

    }
}
