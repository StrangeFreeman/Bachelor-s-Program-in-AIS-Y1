import java.util.*;

//selection sort

public class OO3 {
    public static void printarray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf("\t%d", arr[i]);
        }
        System.out.printf("\n");
    }

    public static void sort(int arr[], int n) {
        int miniindex, temp;
        for (int i = 0; i < n - 1; i++) {
            miniindex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[miniindex]) {
                    miniindex = j;
                }
            }
            if (miniindex != i) {
                temp = arr[i];
                arr[i] = arr[miniindex];
                arr[miniindex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter the number of sorting numbers: ");
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.printf("Enter %d integer numbers you wat to sort:\n", size);
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }
        System.out.printf("The numbers you entered:\n");
        printarray(arr, size);
        sort(arr, size);
        System.out.printf("The sorted numbers you entered:\n");
        printarray(arr, size);
        sort(arr, size);
    }
}
