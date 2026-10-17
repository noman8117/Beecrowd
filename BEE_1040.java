import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;
public class BEE_1040{
    static String format(double value) {
        return BigDecimal.valueOf(value)
                .setScale(1, RoundingMode.HALF_DOWN)
                .toPlainString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double n4 = sc.nextDouble();

        double media = (n1 * 2 + n2 * 3 + n3 * 4 + n4) / 10;

        System.out.println("Media: " + format(media));

        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");

            double exame = sc.nextDouble();
            System.out.println("Nota do exame: " + format(exame));

            media = (media + exame) / 2;

            if (media >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }

            System.out.println("Media final: " + format(media));
        }

        sc.close();
    }
}