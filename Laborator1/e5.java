import java.util.Scanner;

public class e5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ok = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0){
                ok = false;
                break;
            }
        }
        System.out.println(ok);
    }
}
