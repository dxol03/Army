import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class P1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int[] count;
        count = new int[26];

        for (int i =0; i < str.length(); i++) {
            char ch = Character.toUpperCase(str.charAt(i));
            if ('A' <= ch && ch <= 'Z') {
                count[ch-'A']++;
            }
        }

        int max = 0;
        char mychar = '?';

        for (int j = 0; j < count.length; j++) {
            if (count[j]>max) {
                max = count[j];
                mychar = (char) ('A'+j);
            } else if (count[j] == max) {
                mychar = '?';
            }
        }
        System.out.println(mychar);

        

            
        

        
    }
}