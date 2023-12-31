import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class P2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        
        // 주소말고 String끼리 true,False 비교할 때는 str.equals(str1)  

        if (str.equals("1 2 3 4 5 6 7 8")) { 
            System.out.println("ascending");
        } else if (str.equals("8 7 6 5 4 3 2 1")) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }

    }
} 
