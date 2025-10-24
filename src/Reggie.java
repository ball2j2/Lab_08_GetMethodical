import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String ssn = SafeInput.getRegExString(in, "Enter your SSN", "^\\d{3}-\\d{2}-\\d{4}$");
        String mNum = SafeInput.getRegExString(in, "Enter your UC M number", "^(M|m)\\d{5}$");
        String menu = SafeInput.getRegExString(in, "Enter menu choice [O,S,V,Q]", "^[OoSsVvQq]$");

        System.out.println("\nSSN: " + ssn);
        System.out.println("M Number: " + mNum);
        System.out.println("Menu Choice: " + menu);
    }
}

