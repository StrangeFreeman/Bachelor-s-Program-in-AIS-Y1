import java.util.*;

public class ex2 {
    public static int ams(int num) {
        int[] arr = new int[1000];
        int x = num;
        int i = 1;
        while (x > 0) {
            arr[i - 1] = x % 10;
            i++;
            x /= 10;
            // System.out.printf("%d ", arr[i - 2]);
        }
        // 100 = > 001

        // System.out.printf("%d ", i);
        int nn = i - 1;// 位數
        int ans = 0;
        int tmp = 1;
        for (int j = nn - 1; j >= 0; j--) {
            for (int k = 0; k < nn; k++) {
                tmp *= arr[j];
            }
            ans += tmp;

            // System.out.printf("%d ", ans);
            tmp = 1;
        }

        // System.out.printf("%d ", ans);
        if (ans == num) {
            return 1;
        } else {
            return 0;
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int a = 0;
        int aa = 0;// arr count
        int[] arr = new int[1000];
        for (int i = n; i <= m; i++) {
            a = ams(i);
            // System.out.println(a);
            if (a == 1) {
                arr[aa] = i;
                aa++;
            }
        }
        for (int i = 0; i < aa; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }
}
