import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class P1312 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        double a = Double.parseDouble(st.nextToken());
        double b = Double.parseDouble(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        double result = a%b;

        for (int i = 1; i < n; i++) {
            result *= 10;
            result %= b;
        }
        System.out.println((int)((result/b)*10));

        
    }
}
