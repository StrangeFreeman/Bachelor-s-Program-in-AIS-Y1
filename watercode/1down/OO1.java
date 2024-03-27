import java.util.*;

/**
 * insertin sort
 */
public class OO1 {
    public static void p(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf("\t%d", arr[i]);
        }
        System.out.printf("\n");
    }

    public static void sort(int arr[], int n) {
        int tmp = 0;
        int x = 0;
        for (int i = 0; i < n; i++) {
            x = i;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[x] < arr[j]) {
                    tmp = arr[x];
                    arr[x] = arr[j];
                    arr[j] = tmp;
                    x--;
                }
                System.out.printf("%d %d\n", x, j);
            }
            // p(arr, n);
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
        p(arr, n);

    }
}
