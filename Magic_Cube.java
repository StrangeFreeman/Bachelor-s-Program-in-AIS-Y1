import java.util.*;

public class Main {
    public static void test(int[][] arr, int n) {
        // System.out.printf("\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d\t", arr[i][j]);
            }
            System.out.printf("\n");
        }
        // System.out.printf("pos(%d, %d)", x, y);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = 0;
            }
        }

        int c = 1;
        int x = n / 2;
        int y = n - 1;
        int tmpX = x;
        int tmpY = y;
        // init x, y = n/2, n
        // arr => y,x
        while (c <= n * n) {
            if (x < n && y < n) {
                if (a[y][x] == 0) {
                    a[y][x] = c;
                    c++;
                } else {
                    // y -= 2;
                    // x--;
                    x = tmpX;
                    y = tmpY--;
                    // if (x > 0 && y > 0)
                    continue;
                }
            } else if (x == n) {
                x = 0;
                continue;
            } else if (y == n) {
                y = 0;
                continue;
            }
            tmpX = x;
            tmpY = y;
            x++;
            y++;
        }

        // testing
        test(a, n);
    }
}
