import java.util.Scanner;
public class BEE_1133 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int y = sc.nextInt();
        int start=Math.min(x,y);
        int end=Math.max(x,y);
        for(int i=start+1;i<end;i++){
            if(i%5==2 || i%5==3){
                System.out.println(i);
            }
        }
    }
}
