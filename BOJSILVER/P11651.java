import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Comparator;


public class P11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            for (int u = 0; u < 2; u++) {
                arr[i][u] = Integer.parseInt(st.nextToken()); 
            }
        }


        // 2차원배열 y좌표 기준 정렬 
        Arrays.sort(arr, new Comparator<int[]>() {

            @Override
            public int compare(int[] o1, int[] o2) {
              if (o1[1] == o2[1]) {
                return o1[0]-o2[0];
              } else {
                return o1[1]-o2[1];
              }
            }
            
        });

        for (int i = 0; i < N; i++) {
            for (int u = 0; u < 2; u++) {
               System.out.print(arr[i][u]+" ");
            }
            System.out.println();
        }

    }
}