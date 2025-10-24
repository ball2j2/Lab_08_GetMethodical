public class CtoFTableDisplay {
    public static void main(String[] args) {
        System.out.printf("%10s %10s\n", "Celsius", "Fahrenheit");
        System.out.println("----------------------------");

        for (double c = -100; c <= 100; c++) {
            System.out.printf("%10.2f %10.2f\n", c, CtoF(c));
        }
    }

    public static double CtoF(double Celsius) {
        return (Celsius * 9 / 5) + 32;
    }
}

