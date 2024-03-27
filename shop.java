import java.util.*;

/**
 * Main
 */
public class Main {
    public static void out(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.printf("\n");

    }

    public static void sort(int[] arr, int n) {
        int tmp = 0;
        int ix = 0;

        for (int i = 0; i < n; i++) {
            ix = i;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[ix] > arr[j]) {
                    tmp = arr[ix];
                    arr[ix] = arr[j];
                    arr[j] = tmp;
                }
                ix--;
            }
        }
    }

    public static int ohhhyeah(int[] arr, int n) {
        int sum = 0;
        int yeah = n / 3;
        for (int i = 1; i <= yeah; i++) {
            sum += arr[i * 3 - 1];
        }

        return sum;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        sort(arr, n);
        // out(arr, n);
        System.out.printf("%d", ohhhyeah(arr, n));

    }
}
