import java.util.*;

public class Main {
    static int fib(int inin) {
        int n1 = 1;
        int n2 = 1;
        int tmp = 0;
        System.out.printf("%d %d ", n1, n2);
        for (int i = 0; i < inin - 2; i++) {
            tmp = n1 + n2;
            n1 = n2;
            n2 = tmp;
            System.out.printf("%d ", n2);
        }
        return n2;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // int m = fib(n);
        fib(n);

        // System.out.printf("%d", m);
    }
}
