import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;




public class P10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        int floor = 0;
        int num = 0;
        
        for (int i = 0; i < T; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine()," "); 
                int H = Integer.parseInt(st.nextToken());
                int W = Integer.parseInt(st.nextToken());
                int N = Integer.parseInt(st.nextToken());

                floor = (N%H);
                num = ((N/H)+1);

                if (num < 10) {
                    if ((floor == 0) && (N!=H)) {
                        System.out.println(H+"0"+(num-1));
                    }
                        else if ((floor == 0) && (N==H)) {
                            System.out.println(H+"0"+1);
                        }
                     else if (floor != 0) {
                        System.out.println(floor+"0"+num);
                    }  
                } else if (num >= 10) {
                    if ((floor == 0) && (N!=H)) {
                        System.out.println(H+""+(num-1));
                    }
                        
                     else if (floor != 0) {
                        System.out.println(floor+""+num);
                    }
                } 

                
            }      
            

    }    
}
