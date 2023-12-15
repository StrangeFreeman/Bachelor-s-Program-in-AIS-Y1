import java.util.*;

public class ex6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String l = in.nextLine();
        String nl = l.toLowerCase();
        int len = nl.length();
        // System.out.printf("%s", nl);

        int f = -1;

        int a = 0;
        int b = 0;
        int tmp1 = 0;
        int tmp2 = 0;

        for (int i = 0; i < len; i++) {
            tmp1 = (int) nl.charAt(i) - (int) 'a';
            tmp1 /= 26;
            tmp2 = (int) nl.charAt(i) - (int) '0';
            tmp2 /= 10;
            if (tmp1 < 0 || tmp1 > 0) {
                if (tmp2 < 0 || tmp2 > 0)
                    nl.replace(nl.charAt(i), ' ');
            }
        }

        for (int i = 0; i < len / 2; i++) {
            a = (int) nl.charAt(i);
            b = (int) nl.charAt(len - 1 - i);
            if (a - b != 0) {
                f = -1;
                break;
            } else
                f = 0;
        }

        if (f == -1)
            System.out.printf("no");
        else
            System.out.printf("yes");

    }
}
