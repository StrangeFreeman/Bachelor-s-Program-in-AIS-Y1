import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        // n=3
        // *
        // ***
        // *****

        for (int i = n; i > 0; i--) {
            for (int j = i; j > 1; j--)
                System.out.printf(" ");
            for (int j = 0; j < 2 * (n - i + 1) - 1; j++)
                System.out.printf("*");
            System.out.printf("\n");
        }

    }
}
