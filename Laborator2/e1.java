import java.util.Scanner;

public class e1 {

    public static int[] addX(int arr[], int x) {
        int n = arr.length;
        int[] newarr = new int[n + 1];
        for (int i = 0; i < n; i++) {
            newarr[i] = arr[i];
        }
        newarr[n] = x;
        return newarr;
    }

    public static float getMean(int arr[]) {
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        float mean = sum / arr.length;
        return(mean);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[0];
        while (n != -1) {
            arr = addX(arr, n);
            n = sc.nextInt();
        }
        System.out.println(getMean(arr));
    }

}
