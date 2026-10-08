import java.util.Scanner;
public class BEE_2764 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        String[] input = date.split("/");
        System.out.println(input[1]+"/"+input[0]+"/"+input[2]);
        System.out.println(input[2]+"/"+input[1]+"/"+input[0]);
        System.out.println(input[0]+"-"+input[1]+"-"+input[2]);
    }
}