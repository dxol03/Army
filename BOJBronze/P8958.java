import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class P8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());

        int count = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            char[] ch = str.toCharArray();
            

            for (int j = 0; j < ch.length; j++)  {
                
                if (ch[j] == 'O') {
                    count += 1;
                    sum += (count);

                } else {
                     count = 0;
                }
            }
            System.out.println(sum);
            sum = 0;
            count = 0;
        } 
        
        
     }
}
