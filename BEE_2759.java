import java.util.Scanner;
public class BEE_2759 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char A = scanner.next().charAt(0);
        char B = scanner.next().charAt(0);
        char C = scanner.next().charAt(0);
        System.out.println("A = " + A+","+ " B = " + B+","+" C = " + C);
        System.out.println("A = " + B+","+ " B = " + C+","+" C = " + A);
        System.out.println("A = " + C+","+ " B = " + A+","+" C = " + B);
    }
}