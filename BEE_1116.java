import java.util.Scanner;
public class BEE_1116 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        float s;
        for(int i= 1;i<=n;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(b==0){
                System.out.println("divisao impossivel");
            }
            else {
                s=(float)a/b;
                System.out.printf("%.1f%n",s);
            }
        }
    }
}
