import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();

        int l = n.length();
        // System.out.printf("%d\n", l);
        int x = 0;// odd
        int y = 0;
        int c = 0;

        for (int i = l - 1; i >= 0; i--) {
            c = (int) n.charAt(i) - (int) '0';
            if (i % 2 == 0) {
                x += c;
            } else {
                y += c;
            }
        }
        System.out.printf("%d %d\n", x, y);
        int ans = x - y;
        if (ans % 11 == 0) {
            System.out.printf("%s is a multiple of 11.", n);
        } else {
            System.out.printf("%s is not a multiple of 11.", n);
        }

        // System.out.printf("%d %d", x1, x2);

    }
}
