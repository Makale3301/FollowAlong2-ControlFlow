package part06;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4525s
//        switches start at about 75:25 — stop at about 80:18
// Guide: GUIDE.md in this folder, steps 7–11
//
// Part 06 — switch, case, break, default
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called Switches.
//    Leave the "package part06;" line and the "public class Switches" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does.

public class Switches {
    public static void main(String[] args) {
        // Picks the day
        String day = "Friday";
        // Checks what day it is
        switch (day) {
            // If it's Monday
            case "Monday":
                System.out.println("It is Monday");
                break;
            // If it's Tuesday
            case "Tuesday":
                System.out.println("It is Tuesday");
                break;
            // If it's Wednesday
            case "Wednesday":
                System.out.println("It is Wednesday");
                break;
            // If it's Thursday
            case "Thursday":
                System.out.println("It is Thursday");
                break;
            // If it's Friday
            case "Friday":
                System.out.println("It is Friday");
                break;
            // If it's Saturday
            case "Saturday":
                System.out.println("It is Saturday");
                break;
            // If it's Sunday
            case "Sunday":
                System.out.println("It is Sunday");
                break;
            // If none of them match
            default:
                System.out.println(day + " is not a day");
        }

    }
}
