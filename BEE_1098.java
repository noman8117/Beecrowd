/**
 * BEE_1098
 */
public class BEE_1098 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            double I = i / 5.0;
            for (int j = 1; j <= 3; j++) {
                double J = I + j;
                if (i == 0 || i == 5 || i == 10) {
                    System.out.printf("I=%.0f J=%.0f%n", I, J);
                } else {
                    System.out.printf("I=%.1f J=%.1f%n", I, J);
                }
            }
        }
    }
}