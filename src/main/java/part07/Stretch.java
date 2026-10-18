package part07;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4895s
//        rewatch 81:35–87:47 for && || !, 89:29–91:54 for while
// Guide: GUIDE.md in this folder
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.
// If your program never stops: click the red square (Stop) in the Run window.
import java.util.Scanner;
public class Stretch {
    public static void main(String[] args) {

        // My number
        int x = 2;
        // Checks different conditions
        System.out.println(x > 5 && x < 10);
        System.out.println(x < 5 && x < 10);
        System.out.println(x > 5 || x > 7);
        System.out.println(!(x == 7));
        // Starts my count
        int count = 3;
        // Counts down
        while (count > 0) {
            System.out.println("count is " + count);
            count = count - 1;
        }
        // Prints when finished
        System.out.println("done");
        // STRETCH B1 - COUNTDOWN
        // Starts at five
        int number = 5;
        // Counts down to one
        while (number >= 1) {
            System.out.println(number);
            number--;
        }
        // Prints liftoff
        System.out.println("Liftoff!");
        // STRETCH B2 - PASSWORD
        // Lets me type answers
        Scanner scanner = new Scanner(System.in);
        // Saves my password
        String password = "";
        // Keeps asking until the password is right
        while (!password.equals("java123")) {
            System.out.print("Password: ");
            password = scanner.nextLine();
        }
        // Prints when the password is correct
        System.out.println("Access granted");
        // STRETCH B3 - NUMBER CHECK
        // Starts my number
        int pick = 0;
        // Keeps asking for a number from 1 to 10
        while (pick < 1 || pick > 10) {
            System.out.print("Pick a number from 1 to 10: ");
            pick = scanner.nextInt();
        }
        // Prints the number I picked
        System.out.println("You picked " + pick);
        // Closes Scanner
        scanner.close();

    }
}
