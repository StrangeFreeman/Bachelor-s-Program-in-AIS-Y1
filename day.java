import java.util.*;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] w = new int[7];
        for (int i = 0; i < 7; i++)
            w[i] = i + 1;
        int m = in.nextInt();
        int d = in.nextInt();

        int[] M = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        /**
         * 01/01 = Sat
         * 01/31 = Mon
         * 02/28 = Mon
         * 03/31 = Thu
         * 04/30 = Sat
         * 05/31 = Tue
         * 06/30 = Thu
         * 07/31 =
         * 08/31
         * 09/30
         * 10/31
         * 11/30
         * 12/31
         */

        int sum = 0;

        if (d <= 0 || d > M[m]) {
            System.out.printf("");
        }

        for (int i = 0; i <= m - 1; i++) {
            sum += M[i];
        }
        sum += d;
        int ans = sum % 7;
        int[] arr = { 5, 6, 7, 1, 2, 3, 4, 5 };
        // System.out.printf("%d", arr[ans]);

        switch (arr[ans]) {
            case 1:
                System.out.printf("Monday\n");
                break;
            case 2:
                System.out.printf("Tuesday\n");
                break;
            case 3:
                System.out.printf("Wednesday\n");
                break;
            case 4:
                System.out.printf("Thursday\n");
                break;
            case 5:
                System.out.printf("Friday\n");
                break;
            case 6:
                System.out.printf("Saturday\n");
                break;
            case 7:
                System.out.printf("Sunday\n");
                break;
            default:
                break;
        }
    }
}
