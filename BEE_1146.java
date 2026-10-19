import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class BEE_1146 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            int n = Integer.parseInt(line.trim());
            if (n == 0) {
                break;
            }
            for (int i = 1; i <= n; i++) {
                if (i > 1) {
                    output.append(" ");
                }
                output.append(i);
            }
            output.append("\n");
        }
        System.out.print(output);
    }
}