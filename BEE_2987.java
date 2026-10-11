import java.util.Scanner;
public class BEE_2987 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.next().charAt(0);
        int position = letter - 'A' + 1;
        System.out.println(position);
        
    }
}
