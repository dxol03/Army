import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());


        StringTokenizer st1 = new StringTokenizer(br.readLine()," ");
        
        int key = 0;
        for (int i = 0; i < M; i++) {
            key = Integer.parseInt(st1.nextToken());
            if (value(arr,key)) {
                System.out.print("1"+' ');
            } else {
                System.out.print("0"+' ');
            }
        }
        
        
    }
    static boolean value(int[] arr, int key) {
        boolean bl = false;
        int start = 0;
        int finish = arr.length-1;
        while (start <= finish) {
            int mid = (start + finish)/2;
            if (arr[mid] == key) {
                bl = true;
                break;
            } else if (arr[mid] > key) {
                finish = mid - 1;
            } else {
                start = mid + 1;
            }
        
        
       
    }
    return bl;
}
}
    