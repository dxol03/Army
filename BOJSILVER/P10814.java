import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Comparator;

public class P10814 {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[][] arr = new String[N][2];

        

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            for (int u = 0; u < 2; u++) {
                arr[i][u] = st.nextToken();
            }
        }

        Arrays.sort(arr, new Comparator<String[]>() {

            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0])-Integer.parseInt(o2[0]);
              
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
