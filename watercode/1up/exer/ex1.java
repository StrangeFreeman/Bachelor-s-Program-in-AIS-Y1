import java.util.*;

public class ex1 {
    public static void main(String[] args) {
        // 3 == >14
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = 0;
        for (int i = n; i >= 1; i--) {
            ans += i * i;
        }
        System.out.printf("%d", ans);
    }
}
