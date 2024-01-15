import java.io.*;
import java.util.StringTokenizer;

public class P7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];
        int[] score = new int[N];
        

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            for(int u = 0; u < 2; u++) {
                arr[i][u] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < N; i++) {
            for (int u = 0; u < N; u++) {
                if ((arr[i][0] < arr[u][0]) && (arr[i][1] < arr[u][1])) {
                    score[i] += 1;
                } 
            }
        }

        for (int i = 0; i < score.length; i++) {
            score[i] += 1;
        }

        for (int i = 0; i < score.length; i++) {
            System.out.print(score[i]+" ");
        }
    }
}