import java.io.*;

public class P2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[][] dp = new int[15][15];
        
        
        for (int h = 0; h < 15; h++) {
        dp[0][h] = h;
        }

        
        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            
            for (int u =1; u <= k; u++) {
                for (int j = 1; j <= n; j++) {
                    int sum =0;
                    for(int l=1; l<=j; l++){
                        sum += dp[u-1][l];
                    }
                    dp[u][j] = sum;
                }
            }
                System.out.println(dp[k][n]);
            
        }

    }
}