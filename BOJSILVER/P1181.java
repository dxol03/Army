import java.util.*;
import java.io.*;

public class P1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] str = new String[N];

        for (int i = 0; i < N; i++) {
            str[i] = br.readLine();
        }

        Arrays.sort(str);
        Arrays.sort(str, (String s1, String s2) -> s1.length() - s2.length());

        System.out.println(str[0]);
        
        for (int i = 1; i < N; i++) {
            if (!str[i].equals(str[i-1])) {
                System.out.println(str[i]);
            } 
        }
    }
}
