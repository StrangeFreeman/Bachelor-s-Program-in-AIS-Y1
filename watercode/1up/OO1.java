import java.util.*;

public class bs {
    public static int bs(int[] arr, int left, int right, int[] t) {
        int mid = 0;
        if (right >= left) {
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

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = { 12, 17, 23, 27, 33, 39, 42, 59, 63, 68, 76, 78, 81, 88, 94 };
        ;
        int[] target = new int[1];
        System.out.printf("Target: ");
        target[0] = in.nextInt();
        int n = arr.length / target.length;
        int result = bs(arr, 0, n, target);
        if (result == -1) {
            System.out.printf("target not found!");
        } else {
            System.out.printf("target is in arr at index: %d", result);
        }
    }
}
