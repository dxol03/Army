import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class P10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        int[] arr;
        arr = new int['z'-'a'+1];
         
        for (int i = 0; i < 'z'-'a'+1; i++) {
            try {
             arr[i] = S.indexOf('a'+i);
            } catch (Exception e) { 
                arr[i] = -1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}