import java.util.*;

/**
 * reverse
 */
public class reverse {
    public static void out(char[] s) {
        for (int i = 0; i < s.length; i++) {
            System.out.printf("%c", s[i]);
        }
        System.out.printf("\n");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        int n = (int) s.charAt(0) - (int) '0';
        int slen = s.length() - 2;
        char[] st = new char[slen];

        for (int i = 0; i < slen; i++) {
            st[i] = s.charAt(i + 2);
        }

        // System.out.printf("%d\n", n);
        // out(st);

        int x = 0;
        int tx = 0;
        int p = st.length / n;
        int a = 0;
        // System.out.printf("%d\n", p);
        char tmp;

        for (int i = 1; i <= n; i++) {
            a = i * p;
            for (int j = 1; j <= p; j++) {

                // System.out.printf("%d\n", j);

                tx = a - j;
                // System.out.printf("%d %d\n", x, tx);
                if (j <= p / 2) {
                    tmp = st[x];
                    st[x] = st[tx];
                    st[tx] = tmp;

                    // out(st);
                }
                x++;

            }

            // out(st);
        }

        out(st);

    }
}
