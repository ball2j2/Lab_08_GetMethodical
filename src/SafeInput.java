import java.util.Scanner;

public class SafeInput {

    /**
     * Part A: getNonZeroLenString
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";
        do {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        } while (retString.length() == 0);
        return retString;
    }

    /**
     * Part B: getInt
     */
    public static int getInt(Scanner pipe, String prompt) {
        int retVal = 0;
        boolean done = false;
        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                done = true;
            } else {
                System.out.println("You must enter an integer.");
                pipe.nextLine(); // clear buffer
            }
        } while (!done);
        pipe.nextLine(); // clear newline
        return retVal;
    }

    /**
     * Part C: getDouble
     */
    public static double getDouble(Scanner pipe, String prompt) {
        double retVal = 0;
        boolean done = false;
        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextDouble()) {
                retVal = pipe.nextDouble();
                done = true;
            } else {
                System.out.println("You must enter a number.");
                pipe.nextLine();
            }
        } while (!done);
        pipe.nextLine();
        return retVal;
    }

    /**
     * Part D: getRangedInt
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int retVal = 0;
        boolean done = false;
        do {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                if (retVal >= low && retVal <= high) {
                    done = true;
                } else {
                    System.out.println("Number is out of range [" + low + "-" + high + "].");
                }
            } else {
                System.out.println("You must enter an integer.");
                pipe.nextLine();
            }
        } while (!done);
        pipe.nextLine();
        return retVal;
    }

    /**
     * Part E: getRangedDouble
     */
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double retVal = 0;
        boolean done = false;
        do {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextDouble()) {
                retVal = pipe.nextDouble();
                if (retVal >= low && retVal <= high) {
                    done = true;
                } else {
                    System.out.println("Number is out of range [" + low + "-" + high + "].");
                }
            } else {
                System.out.println("You must enter a valid number.");
                pipe.nextLine();
            }
        } while (!done);
        pipe.nextLine();
        return retVal;
    }

    /**
     * Part F: getYNConfirm
     */
    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String response;
        boolean retVal = false;
        boolean done = false;
        do {
            System.out.print("\n" + prompt + " [Y/N]: ");
            response = pipe.nextLine().trim();
            if (response.equalsIgnoreCase("Y")) {
                retVal = true;
                done = true;
            } else if (response.equalsIgnoreCase("N")) {
                retVal = false;
                done = true;
            } else {
                System.out.println("Please enter Y or N.");
            }
        } while (!done);
        return retVal;
    }

    /**
     * Part G: getRegExString
     */
    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String response = "";
        boolean done = false;
        do {
            System.out.print("\n" + prompt + ": ");
            response = pipe.nextLine();
            if (response.matches(regEx)) {
                done = true;
            } else {
                System.out.println("Input does not match pattern: " + regEx);
            }
        } while (!done);
        return response;
    }

    /**
     * Part H: prettyHeader
     */
    public static void prettyHeader(String msg) {
        final int TOTAL_WIDTH = 60;
        for (int i = 0; i < TOTAL_WIDTH; i++) {
            System.out.print("*");
        }
        System.out.println();

        int msgWidth = msg.length();
        int totalInsideWidth = TOTAL_WIDTH - 6; // 3 stars on each side
        int padding = (totalInsideWidth - msgWidth) / 2;

        System.out.print("***");
        for (int i = 0; i < padding; i++) {
            System.out.print(" ");
        }
        System.out.print(msg);
        for (int i = 0; i < totalInsideWidth - padding - msgWidth; i++) {
            System.out.print(" ");
        }
        System.out.println("***");

        for (int i = 0; i < TOTAL_WIDTH; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
