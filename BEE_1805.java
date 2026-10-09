import java.util.Scanner;
public class BEE_1805 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long SUM;
        SUM = ((A + B) * (B - A + 1)) / 2;
        System.out.printf("%d\n", SUM);
    }
}
