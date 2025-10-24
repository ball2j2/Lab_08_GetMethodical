import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Uncomment and test each section as you go

        // System.out.println("Result: " + SafeInput.getNonZeroLenString(in, "Enter a non-blank string"));
        // System.out.println("Result: " + SafeInput.getInt(in, "Enter any integer"));
        // System.out.println("Result: " + SafeInput.getDouble(in, "Enter any double"));
        // System.out.println("Result: " + SafeInput.getRangedInt(in, "Enter an integer", 1, 10));
        // System.out.println("Result: " + SafeInput.getRangedDouble(in, "Enter a double", 0.5, 9.9));
        // System.out.println("Result: " + SafeInput.getYNConfirm(in, "Do you agree"));
        System.out.println("Result: " + SafeInput.getRegExString(in, "Enter your UC M number", "^(M|m)\\d{5}$"));
        // SafeInput.prettyHeader("Welcome to the SafeInput Library");
    }
}
