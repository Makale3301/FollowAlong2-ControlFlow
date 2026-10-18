package part06;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4161s
//        rewatch 69:21–74:54 for if / else if / else, 76:36–80:18 for switch
// Guide: GUIDE.md in this folder
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.
import java.util.Scanner;
public class Stretch {
    public static void main(String[] args) {
        // STRETCH A
        /*
        MY GUESS:
        C or better
        Medium
        Hard
        */
        // My score
        int score = 85;
        // Checks my grade
        if (score >= 70) {
            System.out.println("C or better");
        } else if (score >= 80) {
            System.out.println("B or better");
        } else {
            System.out.println("Below C");
        }
        // My level
        int level = 2;
        // Checks the level
        switch (level) {
            case 1:
                System.out.println("Easy");
            case 2:
                System.out.println("Medium");
            case 3:
                System.out.println("Hard");
                break;
            default:
                System.out.println("Unknown");}

        // STRETCH B1 - WEATHER
        // My temperature
        int temperature = 72;
        // Checks the weather
        if (temperature >= 80) {
            System.out.println("Shorts weather");
        } else if (temperature >= 60) {
            System.out.println("Hoodie weather");
        } else {
            System.out.println("Coat weather");}
        // STRETCH B2 - SEASONS
        // My month
        int month = 4;
        // Checks the season
        switch (month) {
            case 12:
            case 1:
            case 2: System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Fall");
                break;

            default:
                System.out.println("That is not a month");
        }
        // STRETCH B3 - BATTERY
        // Lets me type a number
        Scanner scanner = new Scanner(System.in);
        // Asks for battery percent
        System.out.println("Battery percent:");
        // Saves my answer
        int battery = scanner.nextInt();
        // Checks the battery
        if (battery < 20) {
            System.out.println("Low battery. Go charge!");
        } else if (battery < 60) {
            System.out.println("Charging needed");
        } else {
            System.out.println("Fully charged");
        }
        // Closes Scanner
        scanner.close();

    }
}
