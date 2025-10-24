import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int year = SafeInput.getRangedInt(in, "Enter your birth year", 1950, 2015);
        int month = SafeInput.getRangedInt(in, "Enter your birth month", 1, 12);

        int daysInMonth = switch (month) {
            case 4, 6, 9, 11 -> 30;
            case 2 -> 29;
            default -> 31;
        };

        int day = SafeInput.getRangedInt(in, "Enter your birth day", 1, daysInMonth);
        int hour = SafeInput.getRangedInt(in, "Enter your birth hour", 1, 24);
        int minute = SafeInput.getRangedInt(in, "Enter your birth minute", 1, 59);

        System.out.printf("\nYou were born on %02d/%02d/%d at %02d:%02d\n",
                month, day, year, hour, minute);
    }
}
