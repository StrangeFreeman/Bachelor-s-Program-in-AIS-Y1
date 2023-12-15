import System.util.Scanner;

public class coin{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        if(n%3+m%3 == 3 || n%3+m%3 ==0) System.out.printf("YES");
        else System.out.printf("NO");

    }
}
