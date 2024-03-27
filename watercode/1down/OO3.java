import java.util.*;

/**
 * OO3
 */
public class OO3 {

    public static void p(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t", arr[i]);
        }
        System.out.printf("\n");
    }

    public static void mergesort(int[] arr, int left, int right, int[] temp) {
        int len = arr.length;
        if (left < right) {
            int mid = (left + right) / 2;
            mergesort(arr, left, mid, temp);
            mergesort(arr, mid + 1, right, temp);
            p(arr, len);
            merge(arr, left, mid, right, temp);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right, int[] temp) {
        int i = left;
        int j = mid + 1;
        int t = 0;
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[t] = arr[i];
                t++;
                i++;
            } else {
                temp[t] = arr[j];
                t++;
                j++;
            }
        }

        while (i <= mid) {
            temp[t] = arr[i];
            t++;
            i++;
        }

        while (j <= right) {
            temp[t] = arr[j];
            t++;
            j++;
        }

        t = 0;
        int tmp = left;
        while (tmp <= right) {
            arr[tmp++] = temp[t++];
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        mergesort(arr, 0, n - 1, temp);
        p(arr, n);
    }
}
