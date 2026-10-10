import java.util.Scanner;
public class BEE_1037 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double value = scanner.nextDouble();
        String interval;
        if (value < 0 || value > 100) {
            interval = "Fora de intervalo";
        } else if (value <= 25) {
            interval = "Intervalo [0,25]";
        } else if (value <= 50) {
            interval = "Intervalo (25,50]";
        } else if (value <= 75) {
            interval = "Intervalo (50,75]";
        } else {
            interval = "Intervalo (75,100]";
        }
        System.out.println(interval);
    }
}
