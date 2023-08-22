import java.util.Scanner;

public class HexMultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the max number in multiplication table: ");
        int max = scanner.nextInt();
        for (int i = 1; i <= max; i++) {
            for (int j = 1; j <= max; j++) {
                System.out.println("Hex(" + i + "*" + j + ")=" + decimalToHex(i*j));
            }
        }

    }

    public static String decimalToHex(int decimal) {
        int index;
        StringBuilder hex = new StringBuilder();
        char[] hexSymbols = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        while (decimal > 0) {
            index = decimal % 16;
            hex.append(hexSymbols[index]);
            decimal /= 16;
        }
        return hex.toString();
    }
}

