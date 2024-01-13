import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class P2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine()," ");

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

            int tmp = 0;

        for (int i = 0; i < N; i++) {
            for (int u = i+1; u < N; u++) {
                for (int y = u+1; y < N; y++) {
                    
                    
                    int sum = arr[i] + arr[u] + arr[y];
                    
                    if (tmp < sum && sum <= M) {
                        tmp = sum;
                    }
                    

                }
            }
        }
        System.out.println(tmp);
    }
}
