import java.util.*;

/**
 * quick sort
 */
public class OO2 {
    public static void p(int arr[], int left, int right) {
        for (int i = left; i < right + 1; i++) {
            System.out.printf("\t%d", arr[i]);
        }
        System.out.printf("\n");
    }

    public static void sort(int arr[], int left, int right) {
        int tmp;
        // pivot = left
        if (left < right) {
            int i = left++;
            int j = right;
            while (true) {
                while (i < right + 1 && arr[i] < arr[left]) {
                    i++;
                }
                while (j > left && arr[j] > arr[left]) {
                    j--;
                }
                if (i >= j) {
                    break;
                }
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;

                p(arr, i, j);

            }

            // j will become pivot
            tmp = arr[left];
            arr[left] = arr[j];
            arr[j] = tmp;

            sort(arr, left, j - 1);
            sort(arr, j + 1, right);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        sort(arr, 0, n - 1);
        p(arr, 0, n - 1);
    }
}
