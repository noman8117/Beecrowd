import java.util.Scanner;
import java.math.BigDecimal;
/**
 * BEE_2758
 */
public class BEE_2758 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float A = scanner.nextFloat();
        float B = scanner.nextFloat();
        double C = scanner.nextDouble();
        double D = scanner.nextDouble();
        System.out.printf("A = %f, B = %f%n", A, B);
        System.out.printf("C = %f, D = %f%n", C, D);
        System.out.printf("A = %.1f, B = %.1f%n", A, B);
        System.out.printf("C = %.1f, D = %.1f%n", C, D);
        System.out.printf("A = %.2f, B = %.2f%n", A ,B);
        System.out.printf("C = %.2f, D = %.2f%n", C, D);
        System.out.printf("A = %.3f, B = %.3f%n", A, B);
        System.out.printf("C = %.3f, D = %.3f%n", C, D);
        System.out.printf("A = %.3E, B = %.3E%n", A, B);
        System.out.printf("C = %.3E, D = %.3E%n", C, D);
        System.out.println("A = " + String.format("%.0f", A) + ", B = " + String.format("%.0f", B)); 
        System.out.println("C = " + String.format("%.0f", C) + ", D = " + String.format("%.0f", D));
    }
}