import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class P1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        int sum = 0;
        

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        
            int count = 0;

            if (arr[i] == 2) {
                sum++;
            }

            for (int u = 2; u < arr[i]; u++) {
                if (arr[i]%u == 0) {
                    count = 0;
                    break;
                } else if (arr[i]%u != 0) {
                    count = 1;
                } 
            }
            sum += count;
        }


        
        
        System.out.println(sum);

    }
}
