import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class e2 {
    public static int[] addX(int arr[], int x) {
        int n = arr.length;
        int[] newarr = new int[n + 1];
        for (int i = 0; i < n; i++) {
            newarr[i] = arr[i];
        }
        newarr[n] = x;
        return newarr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] odd = new int[0];
        int[] even = new int[0];
        int n = sc.nextInt();
        for (int i  = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x % 2 == 1) {
                odd = addX(odd, x);
            } else {
                even = addX(even, x);
            }
        }

        if (odd.length > even.length) {
            System.out.println(Arrays.toString(odd));
        } else {
            System.out.print(Arrays.toString(even));
        }
    }
}
