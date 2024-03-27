import java.util.*;

public class ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int min = -1;
        int max = 0;
        if (a > b) {
            min = b;
            max = a;
        } else {
            min = a;
            max = b;
        }
        // int s = (int) Math.sqrt(min) + 1;
        // System.out.printf("%d\n", s);
        int gcd = 0;
        for (int i = 2; i <= min; i++) {
            if (min % i == 0) {
                if (max % i == 0) {
                    gcd = i;
                }
            }
            // System.out.printf("%d %d %d\n", s, i, gcd);
        }
        int lcm = (a * b) / gcd;

        System.out.printf("%d %d", gcd, lcm);

    }
}
