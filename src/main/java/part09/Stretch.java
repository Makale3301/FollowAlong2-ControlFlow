package part09;

// Part 09 — CHECKPOINT. No video in this part.
// Reminders: while loops — part 07 · Scanner — part 03 · Random — part 05
// Video (only if you need it): https://www.youtube.com/watch?v=xk4_1vDrzzo
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.
import java.util.Scanner;
import java.util.Random;
public class Stretch {
    public static void main(String[] args) {

        // STRETCH A

        /*
        MY GUESS:
        n will be 32 and count will be 5.
        The numbers will go 7, 4, 1.
        */

        // Starts the count at zero
        int count = 0;

        // Starts n at 1
        int n = 1;

        // Keeps doubling n until it reaches 20
        while (n < 20) {
            n = n * 2;
            count++;
        }

        // Prints n and count
        System.out.println(n + " " + count);

        // Starts x at 7
        int x = 7;

        // Keeps going until x reaches zero or less
        while (x > 0) {

            // Checks if the number is even
            if (x % 2 == 0) {
                System.out.println(x + " is even");

                // Otherwise it's odd
            } else {
                System.out.println(x + " is odd");
            }

            // Takes three away from x
            x -= 3;
        }


        // STRETCH B1 - ADD NUMBERS

        // Starts my sum at zero
        int sum = 0;

        // Starts counting at one
        int i = 1;

        // Adds the numbers from 1 to 10
        while (i <= 10) {
            sum += i;
            i++;
        }

        // Prints the total
        System.out.println("Sum: " + sum);


        // STRETCH B2 - PICK A NUMBER

        // Lets me type numbers
        Scanner scanner = new Scanner(System.in);

        // Starts my number at zero
        int pick = 0;

        // Keeps asking until the number is between 1 and 10
        while (pick < 1 || pick > 10) {
            System.out.print("Pick a number from 1 to 10: ");
            pick = scanner.nextInt();
        }

        // Prints the number I picked
        System.out.println("Thanks! You picked " + pick);


        // STRETCH B3 - ROLL DICE

        // Lets me roll random numbers
        Random random = new Random();

        // Starts the dice count
        int rolls = 0;

        // Starts the dice at zero
        int dice = 0;

        // Keeps rolling until I get a six
        while (dice != 6) {

            // Rolls a number from 1 to 6
            dice = random.nextInt(6) + 1;

            // Adds one to my roll count
            rolls++;

            // Prints the dice roll
            System.out.println("Rolled a " + dice);
        }

        // Prints how many rolls it took
        System.out.println("It took " + rolls + " rolls to get a 6.");

        // Closes Scanner
        scanner.close();
    }
}



