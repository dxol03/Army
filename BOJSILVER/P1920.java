import java.util.*;
import java.io.*;

public class P1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
    
        int M = Integer.parseInt(br.readLine());
        int[] arr2 = new int[M];
        
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < M; i++) {
            arr2[i] = Integer.parseInt(st1.nextToken());
        }
    
        Arrays.sort(arr);
        
        
        for (int i = 0; i < arr2.length; i++) {
            int start = 0;
            int finish = arr.length - 1;
            boolean result = false;

            while (start <= finish) {
                int mid = (start + finish) / 2;
                if (arr[mid] == arr2[i]) {
                    result = true;
                    break;
                } else if (arr[mid] > arr2[i]) {
                    finish = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            
            if (result) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }
}