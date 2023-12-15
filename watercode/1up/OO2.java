import java.util.*;

public class OO2 {
    public static int bs(int[] arr, int left, int right, int[] t) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == t[0]) {
                return mid;
            } else if (arr[mid] > t[0]) {
                return bs(arr, left, mid - 1, t);
            } else {
                return bs(arr, mid + 1, right, t);
            }
        }

        return -1;
    }

    public static int exponentialsearch(int[] arr, int x, int[] t) {
        if (arr[0] == t[0]) {
            return 0;
        }
        int i = 1;
        while (i < x && arr[i] <= t[0]) {
            i *= 2;// 2^k
        }
        return bs(arr, i / 2, Math.min(i, x - 1), t);
    }

    public static void main(String[] args) {
        int[] arr = { 12, 17, 23, 27, 33, 39, 42, 59, 63, 68, 76, 78, 81, 88, 94 };
        int[] target = { 63 };
        int n = arr.length / target.length;
        int result = exponentialsearch(arr, n, target);
        if (result == -1) {
            System.out.printf("target not found!");
        } else {
            System.out.printf("target is in arr at index: %d", result);
        }
    }
}
