import java.io.*;
import java.util.StringTokenizer;

public class P11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int facN = 1;
        int facK = 1;
        int facNK = 1;
        for (int i = 1; i <= N; i++) {
            facN *= i;
        }
        for (int i = 1; i <= K; i++) {
            facK *= i;
        }
        for (int i = 1; i <= N-K; i++) {
            facNK *= i;
        }

        int ans = (facN)/(facK*facNK);
        System.out.println(ans);

    }
}
