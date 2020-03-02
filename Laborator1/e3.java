import java.util.Scanner;

public class e3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d;
        for (d = 1; d < Math.sqrt(n); d++) {
            if (n % d == 0) {
                System.out.println(d);
                System.out.println(n / d);
            }
        }
        if (d * d == n) {
            System.out.println(d);
        }
    }

}
