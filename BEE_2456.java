import java.util.Scanner;
public class BEE_2456 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        if (a < b && b < c && c < d && d < e) {
            System.out.println("C");
        } else if (a > b && b > c && c > d && d > e) {
            System.out.println("D");
        } else {
            System.out.println("N");   

        }
    }
}
