import java.util.Scanner;

public class MaxSumPathTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of strings: ");
        int N = scanner.nextInt();
        int[][] triangle = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = scanner.nextInt();
            }
        }
        int result = maxSumPath(triangle);
        System.out.println("Maximal sum path: " + result);
    }

    public static int maxSumPath(int[][] triangle) {
        int count = 0;
        for (int[] ints : triangle) {
            count += findMax(ints);
        }
        return count;
    }

    public static int findMax(int[] root) {
        int max = root[0];
        for (int i = 1; i < root.length; i++) {
            if (root[i] > max) {
                max = root[i];
            }
        }
        return max;
    }
}

