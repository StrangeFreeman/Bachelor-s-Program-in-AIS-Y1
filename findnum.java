import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int arrlen = n - 1;// 喂題目這樣設計👋也太噁心了吧

        int[] a = new int[arrlen];
        int[] tmp = new int[n];

        for (int i = 0; i < n; i++)
            tmp[i] = 0;
        for (int i = 0; i < arrlen; i++)
            a[i] = in.nextInt();
        for (int i = 0; i < arrlen; i++)
            tmp[a[i] - 1] = 1;

        for (int i = 0; i < n; i++) {
            if (tmp[i] == 0)
                System.out.printf("%d", i + 1);
        }

    }

}
