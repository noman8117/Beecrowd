import java.util.Scanner;
public class beecrowd_1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int NUMBER = sc.nextInt();
        int HOURS = sc.nextInt();
        double VALUE = sc.nextDouble();
        double SALARY = HOURS * VALUE;
        System.out.printf("NUMBER = %d\n", NUMBER);
        System.out.printf("SALARY = U$ %.2f\n", SALARY);
    }
}
