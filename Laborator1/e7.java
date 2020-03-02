import java.util.Scanner;

public class e7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0 || n == 1) {
            System.out.println(n);
        } else {
            int a = 0;
            int b = 1;
            int curr = 2;
            while (true)
            {
                if (curr == n) {
                    System.out.println(a + b);
                    break;
                } else {
                    int aux = a + b;
                    a = b;
                    b = aux;
                    curr++;
                }
            }
        }
    }
}
