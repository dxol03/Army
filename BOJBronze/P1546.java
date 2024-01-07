import java.io.*;
import java.util.StringTokenizer;

public class P1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        double[] arr = new double[N];

        double M = 0;

        st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < N; i++) {
            arr[i] = Double.parseDouble(st.nextToken());
            if (arr[i] > M) {
                M = arr[i];
            }
        } 

        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
             arr[i] = ((arr[i]/M)*100);
             sum += arr[i];
        }

        System.out.println(sum/N);
        


    }
}