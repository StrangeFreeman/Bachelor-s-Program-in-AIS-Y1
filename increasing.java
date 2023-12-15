import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[10];
        int c = 0;
        for (int i = 0; i < 10; i++) {
            a[i] = in.nextInt();
        }

        int max = a[0];

        for (int i = 1; i < 10; i++) {
            if (max > a[i]) {
                c = c + (max - a[i]);
            } else
                max = a[i];
            // System.out.printf("%d\n", c);
        }
        System.out.printf("%d", c);
    }

}
