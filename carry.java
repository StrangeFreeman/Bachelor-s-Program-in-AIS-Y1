import java.util.Scanner;

public class carry{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] a = new int[10000];
        int[] b = new int[10000];
        
        int n = in.nextInt();
        int m = in.nextInt();
        int x = n;
        int y = m;

        int i = 0;
        while(true){
            a[i] = x % 10;
            //System.out.printf("%d",a[i]);
            i++;
            x = x / 10;
            if(x == 0) {
                //a[i+1] = 0;
                break;
            }
        }
        //System.out.printf("\n");
        i = 0;
        while(true){
            b[i] = y % 10;
            //System.out.printf("%d",b[i]);
            i++;
            y = y / 10;
            if(y == 0) {
                //b[i+1] = 0; 
                break;
            }
        }
        //System.out.printf("\n");
        i = 0;
        int c = 0;
        while(true){
            if(a[i]+b[i] >= 10){
                a[i+1]++;
                c++;
            }
            //System.out.printf("%d %d\n",n,m);

            if(n == 0 && m == 0) break;
            else n = n/10; m = m/10;
            i++;
        }
        if(c == 0) System.out.printf("NO");
        else System.out.printf("%d",c);

    }

}
