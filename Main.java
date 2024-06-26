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

    public static int[] aswap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
        return arr;
    }

    public static void sort(int[] arr, int n) {
        // low => high

        int ix = 0;
        int iy = 0;

        for (int i = 0; i < n; i++) {
            ix = i;
            iy = n - i;
            for (int j = iy + 1; j < n; j++) {
                if (arr[iy] > arr[j]) {
                    aswap(arr, iy, j);
                }
                iy++;
            }
            for (int j = ix - 1; j >= 0; j--) {
                if (arr[ix] < arr[j]) {
                    aswap(arr, ix, j);
                }
                ix--;
            }

            // out(arr, n);

        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        sort(arr, n);
        out(arr, n);

    }
}
