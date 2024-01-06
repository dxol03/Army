import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class P14655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] max = new int[N];
        int[] min = new int[N];

        int maxsum = 0;
        int minsum = 0;

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < N; i++) {
            max[i] = Integer.parseInt(st.nextToken());
            maxsum += Math.abs(max[i]);
        }

        st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < N; i++) {
            min[i] = Integer.parseInt(st.nextToken());
            minsum += Math.abs(min[i]);
        }
        System.out.println(maxsum+minsum);
    }
}