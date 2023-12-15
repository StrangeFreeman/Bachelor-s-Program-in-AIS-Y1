import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n - 1];
        for (int i = 0; i < n - 1; i++)
            a[i] = in.nextInt();
        int x1 = a[0];
        int x2 = 1;
        for (int i = 1; i < n - 1; i++) {
            x1 = x1 ^ a[i];
            System.out.printf("%d ", x1);
        }
        System.out.printf("\n");
        for (int i = 2; i <= n; i++) {
            x2 = x2 ^ i;
            System.out.printf("%d ", x2);
        }
        System.out.printf("\n");
        System.out.printf("%d", x1 ^ x2);
    }
}
