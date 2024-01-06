import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;





public class P2167 { 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arr;
        arr =  new int[N][M];
        
        for (int l = 0; l < N; l++) {
            st = new StringTokenizer(br.readLine()," ");
            for (int a = 0; a < M; a++) {
                arr[l][a] = Integer.parseInt(st.nextToken());
            }
        }
        
        int K = Integer.parseInt(br.readLine());


        while (K-- > 0) {
            st = new StringTokenizer(br.readLine()," ");
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());


            int sum = 0;
            for (int e = i-1; e < x; e++) {
                for (int s = j-1; s < y; s++) {
                    sum += arr[e][s];
                }
            }
            System.out.println(sum);
        }

    }    
}
    

