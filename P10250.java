import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;




public class P10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        
        for (int i = 0; i < T; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine()," "); 
                int H = Integer.parseInt(st.nextToken());
                int W = Integer.parseInt(st.nextToken());
                int N = Integer.parseInt(st.nextToken());

                int floor = (N%H);
                int num = ((N/H)+1);

                if (floor == 0) {
                    floor = H*100;
                    System.out.println(floor+(num-1));
                } else {
                    floor *= 100;
                    System.out.println(floor+num);
                }

                
                
                
            }      
            

    }    
}
