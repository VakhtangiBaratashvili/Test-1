import java.util.Scanner;

public class NonIntegerFractionSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter A: ");
        int a = scanner.nextInt();

        System.out.print("Enter B: ");
        int b = scanner.nextInt();

        System.out.print("Enter C: ");
        int c = scanner.nextInt();

        System.out.print("Enter D: ");
        int d = scanner.nextInt();

        double result = calculateNonIntegerFractionSum(a, b, c, d);
        System.out.println(a + "/" + b + " + " + c + "/" + d + " = " + result);
    }

    public static double calculateNonIntegerFractionSum(int a, int b, int c, int d) {
        return ((double) a / b + (double) c / d);
    }
}

