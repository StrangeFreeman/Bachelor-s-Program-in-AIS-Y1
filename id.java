import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        int[] arr = { 10, 11, 12, 13, 14, 15, 16, 17, 34, 18, 19, 20, 21, 22, 35, 23, 24, 25, 26, 27, 28, 29, 32, 30,
                31, 33 };
        int ans = 0;
        int j = 1;
        int c = (int) n.charAt(0) - (int) 'A';

        // System.out.printf("%d ", c);
        int cc = ((arr[c] % 10) * 9) + (arr[c] / 10);

        // System.out.printf("%d\n", cc);
        for (int i = 8; i > 0; i--) {
            ans += ((int) n.charAt(j) - (int) '0') * i;
            j++;
        }
        ans += cc;
        ans += (int) n.charAt(9) - (int) '0';
        if (ans % 10 == 0) {
            System.out.printf("real");
        } else {
            System.out.printf("fake");
        }
    }
}
