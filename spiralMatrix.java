import java.util.*;

public class Main {
    public static void test(int[][] arr, int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.printf("%d\t", arr[i][j]);
            }
            System.out.printf("\n");
        }
        System.out.printf("\n");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                a[j][i] = 0;
        }

        int l = 0;
        int i = 1;
        int x = 0;
        int y = 0;
        int tx = x;
        int ty = y;
        while (i <= n * n) {
            if (a[y][x] == 0) {
                a[y][x] = i;
                i++;
            }
            if (l % 4 == 0) {
                y++;
            } else if (l % 4 == 1) {
                x++;
            } else if (l % 4 == 2) {
                y--;
            } else if (l % 4 == 3) {
                x--;
            }
            if (x == n || y == n || y == -1 || a[y][x] != 0) {
                l++;
                if (x == n)
                    x = tx;
                else if (y == n)
                    y = ty;
                else if (y == -1)
                    y = ty;
                else if (x == -1)
                    x = tx;
                if (a[y][x] != 0) {
                    x = tx;
                    y = ty;
                }
            }
            tx = x;
            ty = y;
            // test(a, n);
        }
        test(a, n);

    }
}
