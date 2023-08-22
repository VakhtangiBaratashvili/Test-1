import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class CoprimeDivisors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter P: ");
        int p = scanner.nextInt();
        System.out.print("Enter Q: ");
        int q = scanner.nextInt();
        List<Integer> result = new ArrayList<>();
        for (int i = 2; i <= p; i++) {
            if (p % i == 0 && isCoPrime(i, q)) {
                result.add(i);
            }
        }

        if (result.isEmpty()) {
            System.out.println("There are no divisors of " + p + " that are coprime to " + q);
        }
        else {
            System.out.println("Coprime divisors of " + p + " that are coprime to " + q + ":");
            for (Integer i : result) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static boolean isCoPrime(int n, int m) {
        List<Integer> nDivisors = divisors(n);
        List<Integer> mDivisors = divisors(m);
        for (Integer i: nDivisors) {
            for (Integer j: mDivisors) {
                if (Objects.equals(i, j) && i != 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public static List<Integer> divisors(int k) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= k; i++) {
            if (k % i == 0) {
                divisors.add(i);
            }
        }
        return divisors;
    }
}
