public class BEE_1042 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int originalA = a;
        int originalB = b;
        int originalC = c;
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (a > c) {
            int temp = a;
            a = c;
            c = temp;
        }
        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println();
        System.out.println(originalA);
        System.out.println(originalB);
        System.out.println(originalC);
    }
}