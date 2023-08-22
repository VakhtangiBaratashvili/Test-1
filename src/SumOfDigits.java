import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        System.out.println("The sum of the digits is " + sumOfDigits(number));
    }

    public static int sumOfDigits(int n) {
        int sum = 0;
        String intToString = Integer.toString(n);
        String[] digits = new String[intToString.length()];

        for (int i = 0; i < intToString.length(); i++) {
            digits[i] = String.valueOf(intToString.charAt(i));
        }

        for (String i : digits) {
            sum += Integer.parseInt(i);
        }
        return sum;
    }
}

