import java.util.*;

public class Main {
    public static int x(String d) {
        int num = Integer.valueOf(d);
        int[] arr = new int[32];
        int i = 0;

        while (num > 0) {
            arr[i] = num % 2;
            num /= 2;
            i++;
        }
        int x1 = 0;
        for (int j = i - 1; j >= 0; j--) {
            if (arr[j] == 1)
                x1++;
        }
        return x1;
    }

    public static int h2d(String h) {
        int hex = Integer.valueOf(h);
        int[] arr = new int[32];
        int[] bi = new int[4];
        int i = 0;
        while (hex > 0) {
            arr[i] = hex % 10;
            hex /= 10;
            i++;
        }

        int x2 = 0;
        // int y = 0;
        for (int k = 0; k < i; k++) {
            for (int j = 4 - 1; j >= 0; j--) {
                bi[j] = arr[k] % 2;
                arr[k] /= 2;
                if (bi[j] == 1)
                    x2++;
            }
        }

        // System.out.printf("\n%d", i);
        // double d = 0;
        // for (int j = i - 1; j >= 0; j--) {
        // d += arr[j] * Math.pow(16, j);
        // System.out.printf("%d", arr[j]);
        // }
        // System.out.printf("\n%f", d);
        // int ans = (int) d;
        return x2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int n = in.nextInt();
        String n = in.nextLine();
        int x1 = x(n);
        int hentai = h2d(n);
        n = Integer.toString(hentai);
        // System.out.printf("\n");
        int x2 = x(n);

        System.out.printf("%d %d", x1, x2);

    }
}
