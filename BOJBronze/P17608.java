import java.io.*;

public class P17608 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int count = 1;
        
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int maxhigh = arr[N-1]; 
        for (int i = N-1; i >= 0; i--) {
            if (maxhigh < arr[i]) {
                count++;
                maxhigh = arr[i];
        } 
    }
        System.out.println(count);
       

        
        

    }    
}
