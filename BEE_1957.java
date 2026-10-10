import java.util.Scanner;
public class BEE_1957 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        String hex = Integer.toHexString(value);
        hex = hex.toUpperCase();
        System.out.println(hex);
    }
}
