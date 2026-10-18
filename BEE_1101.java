import java.util.Scanner;
public class BEE_1101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        while (m > 0 && n > 0) {
            int start = Math.min(m, n);
            int end = Math.max(m, n);
            int sum = 0;
            for (int i = start; i <= end; i++) {
                System.out.print(i + " ");
                sum += i;
            }
            System.out.println("Sum=" + sum);
            m = sc.nextInt();
            n = sc.nextInt();
        }
        sc.close();
    }
}