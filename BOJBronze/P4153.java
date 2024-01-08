import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class P4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            long c = Long.parseLong(st.nextToken());

            long a2 = a*a;
            long b2 = b*b;
            long c2 = c*c;

            if (a2 ==0 && b2 == 0 && c2==0) {
                break;
            } else if (a2+b2 == c2 || a2 + c2 == b2 || b2 + c2 == a2) {
                System.out.println("right");
            } else{
                System.out.println("wrong");
            }
            
        }
    }
}