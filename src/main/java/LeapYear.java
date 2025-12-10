import java.util.Scanner;

public class LeapYear {

    public static boolean evaluateLeapyear(int year) {
        if (year % 4 == 0 && (!(year % 100 == 0) || year % 400 == 0)) {
            System.out.println(year + " is a leap year");
            return true;
        } else {
            System.out.println(year + " is not a leap year");
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine jahreszahl ein: ");
        int userLeapyear = scanner.nextInt();
        evaluateLeapyear(userLeapyear);
        // is a leapyear: 1980,1972,1720,1600,2000
        // NOT a leapyear: 1900,1800,2100,2001,2023
    }
}
